package day7;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Display {
    public static void main(String[] args) {
        // Database credentials and URL
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_db_username";
        String password = "your_db_password";

        // Query to execute
        String query = "SELECT id, name FROM users";

        try (
            // Establish connection
            Connection conn = DriverManager.getConnection(url, username, password);
            // Create a statement
            Statement stmt = conn.createStatement();
            // Execute query and get results
            ResultSet rs = stmt.executeQuery(query);
        ) {
            // Loop through the result set and print each row
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

