import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

    }
}