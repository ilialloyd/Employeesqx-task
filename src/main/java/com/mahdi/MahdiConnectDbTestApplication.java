package com.mahdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.mahdi.entities", "com.mahdi.repositories", "com.mahdi.services", "com.mahdi.controllers"})
public class MahdiConnectDbTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MahdiConnectDbTestApplication.class, args);
    }

}
