import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.*;

public class Main {

       public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

    }
}