package com.sfm2023.BikeRevolution.Spring;

import com.sfm2023.BikeRevolution.JavaFx.JavaFXApplication;
import javafx.application.Application;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApplication {

    public static void main(String[] args) {
        Application.launch(JavaFXApplication.class, args);
    }

}
