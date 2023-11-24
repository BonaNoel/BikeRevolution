package com.sfm2023.BikeRevolution.JavaFx;

import com.sfm2023.BikeRevolution.Spring.SpringApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class JavaFXApplication extends Application {
    private ConfigurableApplicationContext context;

    @Override
    public void init() throws Exception {
        this.context = org.springframework.boot.SpringApplication.run(SpringApplication.class);
    }
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/UIScene.fxml"));
        loader.setControllerFactory(context::getBean);

        Parent root = loader.load();
        Scene scene = new Scene(root);

        scene.getStylesheets().add("/styles/Styles.css");

        stage.setTitle("BikeRevolution");
        stage.setScene(scene);
        stage.show();
    }
}
