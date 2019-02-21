import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class ConsoleController {

    @Autowired
    public void controller(){

        PostsDao postDeletion = new PostsDao();

        do {
            Scanner scannerAction = new Scanner(System.in);
            System.out.println("What do you want to do? Available options: write, read, delete, exit");
            String selectedAction = scannerAction.nextLine();

            if (selectedAction.equalsIgnoreCase("write")) {

                Scanner scannerWriteTitle = new Scanner(System.in);
                System.out.println("Enter the title of your new post:");
                Scanner scannerWriteText = new Scanner(System.in);
                System.out.println("Enter the text of your new post:");

                PostsDao.addPost(scannerWriteTitle.nextLine(), scannerWriteText.nextLine());
            } else if (selectedAction.equalsIgnoreCase("read")) {

                Scanner scannerDisplay = new Scanner(System.in);
                System.out.println("Enter the title of the post you're looking for:");

                PostsDao.readPost(scannerDisplay.nextLine());
            } else if (selectedAction.equalsIgnoreCase("delete")) {

                Scanner scannerDelete = new Scanner(System.in);
                System.out.println("Enter the title of the post you want to delete:");

                postDeletion.deletePost(scannerDelete.nextLine());
            } else if (selectedAction.equalsIgnoreCase("exit")) {
                break;
            }
        } while (true);

    }
}
