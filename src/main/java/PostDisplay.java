public class PostDisplay {

   public void displayOnePost(String title) {

       System.out.println(title + " " + PostDB.getPosts().get(title));

}


}
