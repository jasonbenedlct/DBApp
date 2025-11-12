import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/water_activity", "root", "Hasones12!");
            System.out.println("✅ Connected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
