package pl.coderslab.charity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CharityApplication {

    @Bean
    public StringToInstitutionConverter stringToAuthorConverter() {
        return new StringToInstitutionConverter();
    }

    public static void main(String[] args) {
        SpringApplication.run(CharityApplication.class, args);
    }

}
