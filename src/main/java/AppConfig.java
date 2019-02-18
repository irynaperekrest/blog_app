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
    public PostDB postDB(){
        return new PostDB();
    }

    @Bean
    public PostDeletion postDeletion(){
        return new PostDeletion();
    }

    @Bean
    public PostDisplay postDisplay(){
        return new PostDisplay();
    }

    @Bean
    public PostWriter postWriter(){
        return new PostWriter();
    }
}
