package org.scoula.jdbc_ex.test;

import org.scoula.jdbc_ex.common.JDBCUtil;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class ConnectionTest {
    @Test
    @DisplayName("jdbc_ex에접속한다.(자동닫기)")
    public void testConnection2() throws SQLException {
        try (Connection conn = JDBCUtil.getConnection()) {
            System.out.println("DB 연결성공");
        }
    }
}
