package day7;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Insertion {

	public class InsertStudent {
	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/school";
	        String user = "root";
	        String password = "your_password"; // Replace with your actual password

	        String insertSQL = "INSERT INTO students (name, age) VALUES (?, ?)";

	        try (Connection conn = DriverManager.getConnection(url, user, password);
	             PreparedStatement stmt = conn.prepareStatement(insertSQL)) {

	            // Sample data
	            stmt.setString(1, "Alice");
	            stmt.setInt(2, 20);

	            int rowsInserted = stmt.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("A new student was inserted successfully!");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

}
