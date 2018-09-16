package com.bambini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductStoreApp {

    // Creates everything for free (servlets, containers...)
    // Standalone application
    public static void main(String[] args) {
        SpringApplication.run(ProductStoreApp.class, args);
    }
}
