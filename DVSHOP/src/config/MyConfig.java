package config;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class MyConfig {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_produk_divashop";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    protected static Connection connection;
    protected static PreparedStatement preparedStatement;
    protected static ResultSet resultSet;
    protected static String query;

    protected static void connection() {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Data Base Connected Succes");
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}