package org.scoula.jdbc_ex.test;

import org.junit.jupiter.api.*;
import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.jdbc_ex.dao.UserDao;
import org.scoula.jdbc_ex.dao.UserDaoImpl;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CrudTest {
    Connection conn = JDBCUtil.getConnection();
    @AfterAll
    static void tearDown() {
        JDBCUtil.close();
    }

    @Test
    @DisplayName("새로운 user를 등록한다.")
    @Order(1)
    public void insertUser()  throws SQLException {
        String sql = "insert into users(id, password, name, role) values(?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "scoula4");
        pstmt.setString(2, "scoula3");
        pstmt.setString(3, "스콜라");
        pstmt.setString(4, "USER");
        int count = pstmt.executeUpdate();
//        UserDao dao = new UserDaoImpl();
//        UserVO user = new UserVO("scoula6", "scoula3", "스콜라", "USER");
//        int count = dao.create(user);
        Assertions.assertEquals(1, count);
        System.out.println("Insert된 행 수: " + count);
        pstmt.close();
    }

    @Test
    @DisplayName("user 목록을 추출한다.")
    @Order(2)
    public void selectUser() throws SQLException {
        String sql ="select * from users";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
            System.out.println(rs.getString("name"));
        }
        stmt.close();
    }

    @Test
    @DisplayName("특정 user 검색한다.")
    @Order(3)
    public void selectUserById() throws SQLException {
        String userid = "scoula4";
        String sql ="select * from users where id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, userid);
        ResultSet rs = stmt.executeQuery();
        if(rs.next()) {
            System.out.println(rs.getString("name"));
        } else {
            throw new SQLException("scoula not found");
        }
        stmt.close();
        rs.close();
    }

    @Test
    @DisplayName("특정 user 수정한다.")
    @Order(4)
    public void updateUser() throws SQLException {
        String userid = "scoula4";
        String sql ="update users set name= ?  where id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "스콜라 수정");
        stmt.setString(2, userid);
        int count = stmt.executeUpdate();
        Assertions.assertEquals(1, count);
        stmt.close();
    }

    @Test
    @DisplayName("지정한 사용자를 삭제한다.")
    @Order(5)
    public void deleteUser() throws SQLException {
        String userid = "scoula4";
        String sql ="delete from users where id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, userid);
        int count = stmt.executeUpdate();
        Assertions.assertEquals(1, count);
        stmt.close();
    }
}