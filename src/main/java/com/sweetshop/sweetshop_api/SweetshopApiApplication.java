package com.sweetshop.sweetshop_api;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SweetshopApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SweetshopApiApplication.class, args);
    }

    @PostConstruct
    public void testProps() {
        System.out.println("JWT Secret = " + System.getProperty("jwt.secret"));
    }

}
