public class PostWriter {

    public void addPost(String title, String text){


        PostDB.getPosts().put(title, text);


        }
}
