package day7;

	import java.sql.*;
	import java.util.Scanner;

	public class InventoryApp {
	    static final String DB_URL = "jdbc:sqlite:inventory.db";

	    public static void main(String[] args) {
	        try (Connection conn = DriverManager.getConnection(DB_URL);
	             Scanner scanner = new Scanner(System.in)) {

	            createTable(conn);

	            while (true) {
	                System.out.println("\n1. Add Product  2. View Products  3. Search Product  4. Exit");
	                System.out.print("Choose: ");
	                switch (scanner.nextLine()) {
	                    case "1" -> addProduct(conn, scanner);
	                    case "2" -> viewProducts(conn);
	                    case "3" -> searchProduct(conn, scanner);
	                    case "4" -> System.exit(0);
	                    default -> System.out.println("Invalid choice.");
	                }
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    static void createTable(Connection conn) throws SQLException {
	        String sql = """
	            CREATE TABLE IF NOT EXISTS products (
	                id INTEGER PRIMARY KEY AUTOINCREMENT,
	                name TEXT NOT NULL,
	                quantity INTEGER,
	                price REAL
	            )""";
	        conn.createStatement().execute(sql);
	    }

	    static void addProduct(Connection conn, Scanner scanner) throws SQLException {
	        System.out.print("Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Quantity: ");
	        int qty = Integer.parseInt(scanner.nextLine());
	        System.out.print("Price: ");
	        double price = Double.parseDouble(scanner.nextLine());

	        String sql = "INSERT INTO products (name, quantity, price) VALUES (?, ?, ?)";
	        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setString(1, name);
	            stmt.setInt(2, qty);
	            stmt.setDouble(3, price);
	            stmt.executeUpdate();
	            System.out.println("Added.");
	        }
	    }

	    static void viewProducts(Connection conn) throws SQLException {
	        String sql = "SELECT * FROM products";
	        try (Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
	            while (rs.next()) {
	                System.out.printf("ID:%d | %s | Qty:%d | Price:%.2f%n",
	                        rs.getInt("id"),
	                        rs.getString("name"),
	                        rs.getInt("quantity"),
	                        rs.getDouble("price"));
	            }
	        }
	    }

	    static void searchProduct(Connection conn, Scanner scanner) throws SQLException {
	        System.out.print("Search name: ");
	        String keyword = scanner.nextLine();

	        String sql = "SELECT * FROM products WHERE name LIKE ?";
	        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setString(1, "%" + keyword + "%");
	            ResultSet rs = stmt.executeQuery();
	            while (rs.next()) {
	                System.out.printf("ID:%d | %s | Qty:%d | Price:%.2f%n",
	                        rs.getInt("id"),
	                        rs.getString("name"),
	                        rs.getInt("quantity"),
	                        rs.getDouble("price"));
	            }
	        }
	    }
	}


