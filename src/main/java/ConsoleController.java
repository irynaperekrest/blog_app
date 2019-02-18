import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Scanner;

public class ConsoleController {

    @Autowired
    public void controller(){
        PostDB postDB = new PostDB();
        PostDisplay postDisplay = new PostDisplay();
        PostWriter postWriter = new PostWriter();
        PostDeletion postDeletion = new PostDeletion();

        Map<String, String> posts = postDB.readPostsDBFromFile();

        do {
            Scanner scannerAction = new Scanner(System.in);
            System.out.println("What do you want to do? Available options: new post, read post, delete post, exit");
            String selectedAction = scannerAction.nextLine();

            if (selectedAction.equalsIgnoreCase("new post")) {

                Scanner scannerWriteTitle = new Scanner(System.in);
                System.out.println("Enter the title of your new post:");
                Scanner scannerWriteText = new Scanner(System.in);
                System.out.println("Enter the text of your new post:");

                postWriter.addPost(scannerWriteTitle.nextLine(), scannerWriteText.nextLine());
            } else if (selectedAction.equalsIgnoreCase("read post")) {

                Scanner scannerDisplay = new Scanner(System.in);
                System.out.println("Enter the title of the post you're looking for:");

                postDisplay.displayOnePost(scannerDisplay.nextLine());
            } else if (selectedAction.equalsIgnoreCase("delete post")) {

                Scanner scannerDelete = new Scanner(System.in);
                System.out.println("Enter the title of the post you want to delete:");

                postDeletion.deletePost(scannerDelete.nextLine());
            } else if (selectedAction.equalsIgnoreCase("exit")) {
                break;
            }
        } while (true);


        postDB.savePostsDBToFile();

    }
}
