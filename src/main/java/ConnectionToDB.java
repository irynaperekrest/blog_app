import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionToDB {

    public static Connection connectToDB(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/blog_db";
        String user = "root";
        String password = "pass";

        try {
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            return conn;
        }
    }
}
