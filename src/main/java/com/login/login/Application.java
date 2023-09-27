package com.login.login;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class Application extends javafx.application.Application {
    private static Stage stage;
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.setResizable(true);
        Parent root =  FXMLLoader.load(getClass().getResource("register.fxml"));

        primaryStage.setTitle("NIC ASIA MOBANK");
        primaryStage.setScene(new Scene(root,700,550));
        primaryStage.show();
    }

    public void changeScene(String fxml) throws IOException{                    // to change the scene
        Parent newPane = FXMLLoader.load(getClass().getResource(fxml));
        stage.getScene().setRoot(newPane);

    }
    public static void main(String[] args) {

        launch();
    }
}