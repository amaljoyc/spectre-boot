package com.amaljoyc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.amaljoyc")
public class AppInitializer {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AppInitializer.class, args);
    }

}