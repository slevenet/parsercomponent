package com.marketmotion.parsercomponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ParsercomponentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParsercomponentApplication.class, args);
    }

}
