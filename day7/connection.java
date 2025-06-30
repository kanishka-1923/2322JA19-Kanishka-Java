package day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connection{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database"; // replace with your DB name
        String user = "your_username";
        String password = "your_password";

        try {
            // Load MySQL JDBC Driver (optional in newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database!");

            // Example query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT DATABASE();");

            while (rs.next()) {
                System.out.println("Current Database: " + rs.getString(1));
            }

            // Clean up
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
