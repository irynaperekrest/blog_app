import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PostWriter {

    private Connection conn;

    public PostWriter(Connection conn) {
        this.conn = conn;
    }

    public void addPost(String title, String text){

        try {
            Statement statement = conn.createStatement();
            statement.execute("INSERT INTO posts(title,text)"+"VALUES('"+title+"','"+text+"');");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        }
}
