package rewardModule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

/**
 * Class in charge of launching the Rewards service application.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //Added to fix NumberFormatException due to decimal number separator
        Locale.setDefault(new Locale("en", "US"));

        SpringApplication.run(rewardModule.Application.class, args);
    }

}
