package academy.learnprograming;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = "academy.learnprogramming")
public class WebMain {
    public static void main(String[] args) {
        log.info("running the main class");
        SpringApplication.run(WebMain.class, args);
    }
}
