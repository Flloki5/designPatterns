package com.flloki.patterns;

import com.flloki.patterns.creational.builder.ProductDetails;
import com.flloki.patterns.creational.singleton.Config2;
import com.flloki.patterns.creational.singleton.Configuration;
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
            Configuration config1 = Configuration.getInstance();
            Configuration config2 = Configuration.getInstance();

            System.out.println(config1 == config2);

            Config2 superConfig1 = Config2.SUPER_CONFIG;
            Config2 superConfig2 = Config2.SUPER_CONFIG;

            System.out.println(superConfig1 == superConfig2); // he already knows ;)
        };
    }
}


/*
BUILDER PATTERN
            ProductDetails productDetails = ProductDetails.builder()
                    .withName("Chocolate")
                    .withWeight(100)
                    .build();

            builder()
                    .withPrice(50)
                    .withCategories("Food")
                    .build();
 */
