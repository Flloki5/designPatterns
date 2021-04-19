package com.flloki.patterns;

import com.flloki.patterns.creational.builder.ProductDetails;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.flloki.patterns.creational.builder.ProductDetails.builder;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {

            ProductDetails productDetails = ProductDetails.builder()
                    .withName("Chocolate")
                    .withWeight(100)
                    .build();

            builder()
                    .withPrice(50)
                    .withCategories("Food")
                    .build();
        };
    }
}
