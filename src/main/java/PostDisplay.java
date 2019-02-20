import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostDisplay {

    private Connection conn;

    public PostDisplay(Connection conn) {
        this.conn = conn;
    }

    public void displayOnePost(String title) {

        try {
            Statement statement = conn.createStatement();
            ResultSet text = statement.executeQuery("SELECT text FROM posts WHERE tittle=" + title);
            System.out.println(title + " " + text);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
