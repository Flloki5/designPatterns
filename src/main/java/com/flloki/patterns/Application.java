package com.flloki.patterns;

import com.flloki.patterns.functional.monad.Form;
import com.flloki.patterns.functional.monad.ValidationError;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.flloki.patterns.functional.monad.ValidationError.OVERSIZED_USERNAME;
import static com.flloki.patterns.functional.monad.Validator.of;
import static com.flloki.patterns.functional.monad.ValidationError.USERNAME_NULL;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {
            of(new Form())
                    .validate(form -> form.getUsername() != null, USERNAME_NULL)
                    .validate(form -> form.getUsername().length() > 10, OVERSIZED_USERNAME);

        };
    }
}



 /*           //// STRATEGY PATTERN ////
            Numbers numbers = new Numbers(5, 10);

            int addition = numbers.calculate(new Addition());
            int subtraction = numbers.calculate(new Subtraction());
            int multiplication = numbers.calculate(new Multiplication());

            System.out.println(addition);
            System.out.println(subtraction);
            System.out.println(multiplication);
*/

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
