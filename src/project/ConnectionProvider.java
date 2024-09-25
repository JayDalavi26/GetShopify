package project;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            // Use the updated MySQL driver for MySQL 8.x
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Adjust the URL for MySQL 8.x
            String url = "jdbc:mysql://localhost:3306/ospjsp";
            String user = "root";
            String password = "Jay@2003";
            
            // Establish the connection
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e);
            return null;
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e);
            return null;
        }
    }
}
