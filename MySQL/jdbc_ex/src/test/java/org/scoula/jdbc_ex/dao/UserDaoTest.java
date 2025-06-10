package org.scoula.jdbc_ex.dao;

import org.junit.jupiter.api.*;
import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.SQLException;
import java.util.List;

public class UserDaoTest {
    UserDao dao = new UserDaoImpl();

    @AfterAll
    static void tearDown() {
        JDBCUtil.close();
    }

    @Test
    @DisplayName("user를 등록합니다.")
    @Order(1)
    void create() throws SQLException {
        UserVO user = new UserVO("ssamz12", "ssanz12314", "쌤즈2", "ADMIN");
        int count = dao.create(user);
        Assertions.assertEquals(1, count);
    }

    @Test
    @Order(2)
    void getList() throws SQLException {
        List<UserVO> list = dao.getList();
        Assertions.assertTrue(list.size() > 0);
    }

    @Test
    @Order(3)
    void getById() throws SQLException {
        UserVO user = dao.get("user1");
        Assertions.assertEquals("이름", user.getName());
    }

    @Test
    @Order(4)
    void update() throws SQLException {
        UserVO user = new UserVO("user1", "pw", "수정된이름", "ADMIN");
        int count = dao.update(user);
        Assertions.assertEquals(1, count);
    }

    @Test
    @Order(5)
    void delete() throws SQLException {
        int count = dao.delete("user1");
        Assertions.assertEquals(1, count);
    }
}














