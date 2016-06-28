package com.amaljoyc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.amaljoyc.service.SimpleMailSender;

@SpringBootApplication(scanBasePackages = "com.amaljoyc")
public class AppInitializer {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AppInitializer.class, args);
        
        try {
        	SimpleMailSender sender = (SimpleMailSender) ctx.getBean("simpleMailSender");
            // sender.sendMail("hello@gmail.com", "Hello", "This is a test mail");
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }

}