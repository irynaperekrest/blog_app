import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ConsoleController consoleController(){
        return new ConsoleController();
    }

    @Bean
    public PostsDao postsDao(){
        return new PostsDao();
    }
}
