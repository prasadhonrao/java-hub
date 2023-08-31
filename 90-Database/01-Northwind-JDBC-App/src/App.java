import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {

    // static String url = "jdbc:mysql//localhost:3306/northwind";
    static String connectionUrl = "jdbc:sqlserver://localhost;encrypt=true;username=sa;password=FriendsForever1!;database=northwind";
    static String username = "sa";
    static String password = "FriendsForever1!";

    public static void main(String[] args) throws Exception {
        System.out.println("Northwind JDBC App!");

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        try (Connection conn = DriverManager.getConnection(connectionUrl)) {

            // Check if connection is successful
            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

            // Create a statement
            Statement stmt = conn.createStatement();
            stmt.executeQuery("SELECT * FROM Customers");

        }

    }
}
