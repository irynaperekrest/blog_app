public class PostDeletion {

   public void deletePost(String title){

       PostDB.getPosts().remove(title);

   }


}
