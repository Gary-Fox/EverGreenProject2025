package com.projectEvergreen.seed_inventory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SeedInventoryApplication {

    public static void main(String[] args) 
    {
        SpringApplication.run(SeedInventoryApplication.class, args);
    }

    @Bean
    CommandLineRunner init() {
        return args -> {
            System.out.println("Spring Boot Application Started!");
            
            // Test creating a crop
            Crop tomato = new Crop("Tomato", 100, 90, GrowingSeasons.SUMMER);
            System.out.println("Created crop: " + tomato.getCropName());
        };
    }
}
