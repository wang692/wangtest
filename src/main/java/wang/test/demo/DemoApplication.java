package wang.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("vim from wzh");
        System.out.println("vim from cz");
        SpringApplication.run(DemoApplication.class, args);
    }

}
