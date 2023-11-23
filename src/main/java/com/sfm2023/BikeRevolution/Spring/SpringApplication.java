package com.sfm2023.BikeRevolution.Spring;

import com.sfm2023.BikeRevolution.JavaFx.JavaFXApplication;
import com.sfm2023.BikeRevolution.Repositories.PartsRepository;
import javafx.application.Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication(scanBasePackages = "com.sfm2023.BikeRevolution")
public class SpringApplication implements CommandLineRunner {


    public static void main(String[] args) {
        Application.launch(JavaFXApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
