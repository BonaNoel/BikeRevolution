package com.sfm2023.BikeRevolution.Spring;

import com.sfm2023.BikeRevolution.JavaFx.JavaFXApplication;
import javafx.application.Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication(scanBasePackages = "com.sfm2023.BikeRevolution")
@EnableJpaRepositories("com.sfm2023.BikeRevolution.Repositories")
@EntityScan("com.sfm2023.BikeRevolution.Entities")
public class SpringApplication {


    public static void main(String[] args) {
        Application.launch(JavaFXApplication.class, args);
    }

}
