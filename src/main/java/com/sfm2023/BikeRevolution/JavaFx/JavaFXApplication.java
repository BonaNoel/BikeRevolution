package com.sfm2023.BikeRevolution.JavaFx;


import com.sfm2023.BikeRevolution.Spring.SpringApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

import java.util.Objects;
@Component
public class JavaFXApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        org.springframework.boot.SpringApplication.run(SpringApplication.class);

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/UIScene.fxml")));
        Scene scene = new Scene(root);

        scene.getStylesheets().add("/styles/Styles.css");

        stage.setTitle("BikeRevolution");
        stage.setScene(scene);
        stage.show();
    }
}
