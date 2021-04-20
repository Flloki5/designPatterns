package com.flloki.patterns;

import com.flloki.patterns.behavioral.strategy.Addition;
import com.flloki.patterns.behavioral.strategy.Multiplication;
import com.flloki.patterns.behavioral.strategy.Numbers;
import com.flloki.patterns.behavioral.strategy.Subtraction;
import com.flloki.patterns.creational.builder.ProductDetails;
import com.flloki.patterns.creational.singleton.Config2;
import com.flloki.patterns.creational.singleton.Configuration;
import com.flloki.patterns.structural.adapter.example1.Doge;
import com.flloki.patterns.structural.adapter.example1.MPHToKPHAdapter;
import com.flloki.patterns.structural.adapter.example1.Movable;
import com.flloki.patterns.structural.adapter.example2.ERP2ToLegacySystemAdapterImpl;
import com.flloki.patterns.structural.adapter.example2.ERPAccountancyBusinessSystemImpl;
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
            Numbers numbers = new Numbers(5, 10);

            int addition = numbers.calculate(new Addition());
            int subtraction = numbers.calculate(new Subtraction());
            int multiplication = numbers.calculate(new Multiplication());

            System.out.println(addition);
            System.out.println(subtraction);
            System.out.println(multiplication);

        };
    }
}



 /*           //// ADAPTER PATTERN ////
            ERPAccountancyBusinessSystemImpl legacy = new ERPAccountancyBusinessSystemImpl();
            ERP2ToLegacySystemAdapterImpl newSystem = new ERP2ToLegacySystemAdapterImpl(legacy);

            newSystem.submitTimeFor();

            Movable doge = new Doge();

            System.out.println(doge.getSpeedInMPH());

            MPHToKPHAdapter mphToKPHAdapter = new MPHToKPHAdapter(doge);

            System.out.println(mphToKPHAdapter.getSpeedInKPH());
 */


 /*
                        /// BUILDER PATTERN ///
            ProductDetails productDetails = ProductDetails.builder()
                    .withName("Chocolate")
                    .withWeight(100)
                    .build();

            builder()
                    .withPrice(50)
                    .withCategories("Food")
                    .build();
 */


 /*           //// SINGLETON PATTERN ////
            Configuration config1 = Configuration.getInstance();
            Configuration config2 = Configuration.getInstance();

            System.out.println(config1 == config2);

            Config2 superConfig1 = Config2.SUPER_CONFIG;
            Config2 superConfig2 = Config2.SUPER_CONFIG;

            System.out.println(superConfig1 == superConfig2); // he already knows ;)
 */
