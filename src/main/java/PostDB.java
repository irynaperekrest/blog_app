import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class PostDB {

    private static Map<String, String> posts = new HashMap();

    public static Map<String, String> getPosts() {
        return posts;
    }

    public Map<String, String> readPostsDBFromFile() {

        try (BufferedReader br = new BufferedReader(new FileReader("posts.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lines = line.split(",");
                posts.put(lines[0], lines[1]);

            }
            return posts;
        }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
                return posts;
        }

    }

    public void savePostsDBToFile(){
        try(FileWriter writer = new FileWriter("posts.txt",false))
        {
            for(Map.Entry < String, String > entry : posts.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                writer.write(key  + "," + value + "\n");
            }


        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }



}
