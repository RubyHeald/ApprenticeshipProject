import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDatabase {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:h2:file:C:/Users/Ash/ApprenticeProject", "sa", "")) {
            if (conn != null) {
                System.out.println("CreateDatabase created successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
