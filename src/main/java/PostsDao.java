import java.sql.*;

public class PostsDao {

    static Connection conn = null;
    static String url = "jdbc:mysql://localhost:3306/blog_db";
    static String user = "root";
    static String password = "pass";

    public static void addPost(String title, String text) {

        try {
            conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();
            statement.execute("INSERT INTO posts(title,text)"+"VALUES('"+title+"','"+text+"');");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    static public void readPost(String title) {

        try {
            conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();
            ResultSet text = statement.executeQuery("SELECT text FROM posts WHERE title='"+title+"';");
            text.next();
            System.out.println(title + " " + text.getString("text"));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    static public void deletePost(String title) {

        try {
            conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();
            statement.execute("DELETE FROM posts WHERE title='"+title+"';");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
