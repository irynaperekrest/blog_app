import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostDeletion {

    private Connection conn;

    public PostDeletion(Connection conn) {
        this.conn = conn;
    }

    public void deletePost(String title){

           try {
               Statement statement = conn.createStatement();
               statement.execute("DELETE FROM posts WHERE tittle=" + title);
           } catch (SQLException e) {
               System.out.println(e.getMessage());
           }
   }
}
