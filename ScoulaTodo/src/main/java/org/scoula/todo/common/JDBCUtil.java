package org.scoula.todo.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    // static field
    private static Connection conn = null;

    // static block
    static {
        try {
            Properties prop = new Properties();
            prop.load(JDBCUtil.class.getResourceAsStream("/application.properties"));

            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String user = prop.getProperty("user");
            String password = prop.getProperty("password");

            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn; // 주소를 넘겨주는 것 = 참조값을 넘겨주는 값
    }

    public static void close() {
        try {
            if(conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}






