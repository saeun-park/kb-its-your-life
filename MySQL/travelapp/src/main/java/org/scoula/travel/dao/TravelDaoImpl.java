package org.scoula.travel.dao;

import org.scoula.database.JDBCUtil;
import org.scoula.travel.domain.TravelImageVO;
import org.scoula.travel.domain.TravelVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TravelDaoImpl implements TravelDao{
    Connection conn = JDBCUtil.getConnection();

    @Override
    public void insert(TravelVO travel) {
        String sql = "INSERT INTO tbl_travel VALUES(?,?,?,?,?,?)";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setLong(1, travel.getNo());
            pstmt.setString(2, travel.getDistrict());
            pstmt.setString(3, travel.getTitle());
            pstmt.setString(4, travel.getDescription());
            pstmt.setString(5, travel.getAddress());
            pstmt.setString(6, travel.getPhone());
            int count = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insertImage(TravelImageVO image) {
        String sql = "INSERT INTO tbl_travel_image(filename, travel_no) VALUES(?,?)";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, image.getFilename());
            pstmt.setLong(2, image.getTravelNo());
            int count = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 전체 데이터 건수 얻기
    @Override
    public int getTotalCount() {
        String sql = "SELECT COUNT(*) FROM tbl_travel";
        try(PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()){
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 권역 목록 얻기
    @Override
    public List<String> getDistricts() {
        List<String> districts = new ArrayList<>();
        String sql = "SELECT DISTINCT district FROM tbl_travel ORDER BY district";

        try(PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()){
            while(rs.next()){
                districts.add(rs.getString("district"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return districts;
    }

    private TravelVO map(ResultSet rs) throws SQLException {
        return TravelVO.builder()
                .no(rs.getLong("no"))
                .district(rs.getString("district"))
                .title(rs.getString("title"))
                .description(rs.getString("description"))
                .address(rs.getString("address"))
                .phone(rs.getString("phone"))
                .build();
    }

    // 전체 목록 얻기
    @Override
    public List<TravelVO> getTravels() {
        List<TravelVO> travels = new ArrayList<>();
        String sql = "SELECT * FROM tbl_travel ORDER BY district, title";

        try(PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()){
            while(rs.next()){
                TravelVO travel = map(rs);
                travels.add(map(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return travels;
    }

    // 페이지별 목록 얻기
    @Override
    public List<TravelVO> getTravels(int page) {
        List<TravelVO> travels = new ArrayList<>();
        String sql = "SELECT * FROM tbl_travel ORDER BY district, title LIMIT ?, ?";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            int count = 10;
            int start = (page - 1) * count;
            pstmt.setInt(1, start);
            pstmt.setInt(2, count);

            try(ResultSet rs = pstmt.executeQuery()){
                while(rs.next()){
                    TravelVO travel = map(rs);
                    travels.add(travel);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return travels;
    }

    // 특정 권역의 목록 얻기
    @Override
    public List<TravelVO> getTravels(String district) {
        List<TravelVO> travels = new ArrayList<>();
        String sql = "select * from tbl_travel where district = ?";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, district);

            try(ResultSet rs = pstmt.executeQuery()){
                while(rs.next()){
                    TravelVO travel = map(rs);
                    travels.add(travel);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return travels;
    }

    private TravelImageVO mapImage(ResultSet rs) throws SQLException {
        return TravelImageVO.builder()
                .no(rs.getLong("tino"))
                .filename(rs.getString("filename"))
                .travelNo(rs.getLong("travel_no"))
                .build();
    }

    // 관광지 정보 하나 얻기
    @Override
    public Optional<TravelVO> getTravel(Long no) {
        TravelVO travel = null;
        String sql = """
                select t.*, ti.no as tino, ti.filename, ti.travel_no
                from tbl_travel t
                left outer join tbl_travel_image ti on t.no = ti.travel_no
                where t.no = ?;
                """;

        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setLong(1,no);
            try (ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    travel = map(rs);
                    List<TravelImageVO> images = new ArrayList<>();
                    try{
                        do{
                            TravelImageVO image = mapImage(rs);
                            images.add(image);
                        }while(rs.next());
                    }catch(SQLException e){
                        // 이미지가 없는 경우 발생
                        e.printStackTrace();
                    }
                    travel.setImages(images);
                    return Optional.of(travel);
                }else{
                    return Optional.empty();
                }
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public int update(TravelVO travel) {
        String sql = """
        UPDATE tbl_travel 
        SET district = ?, title = ?, description = ?, address = ?, phone = ?
        WHERE no = ?
    """;
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, travel.getDistrict());
            pstmt.setString(2, travel.getTitle());
            pstmt.setString(3, travel.getDescription());
            pstmt.setString(4, travel.getAddress());
            pstmt.setString(5, travel.getPhone());
            pstmt.setLong(6, travel.getNo()); // 조건절 PK
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int delete(Long no) {
        String sql = "DELETE FROM tbl_travel WHERE no = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setLong(1, no);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
