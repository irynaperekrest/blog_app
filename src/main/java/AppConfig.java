import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ConsoleController consoleController(){
        return new ConsoleController();
    }

    @Bean
    public ConnectionToDB connectionToDB(){
        return new ConnectionToDB();
    }

    @Bean
    public PostDeletion postDeletion(){
        return new PostDeletion(ConnectionToDB.connectToDB());
    }

    @Bean
    public PostDisplay postDisplay(){
        return new PostDisplay(ConnectionToDB.connectToDB());
    }

    @Bean
    public PostWriter postWriter(){
        return new PostWriter(ConnectionToDB.connectToDB());
    }
}
