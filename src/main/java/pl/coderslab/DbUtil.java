package pl.coderslab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static final String DB_URL_CINEMAS = "jdbc:mysql://localhost:3306/workshop2?allowPublicKeyRetrieval=true&useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "coderslab";

    public static Connection connectWorkshop2() throws SQLException {
        return DriverManager.getConnection(DB_URL_CINEMAS, DB_USER, DB_PASS);
    }
}
