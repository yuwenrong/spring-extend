package org.example;

import org.example.extend.MyApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainStart {
    public static void main(String[] args) {
//        SpringApplication springApplication = new SpringApplication(MainStart.class);
//        springApplication.addInitializers(new MyApplicationContextInitializer());
//        springApplication.run(args);

        SpringApplication.run(MainStart.class);
    }
}