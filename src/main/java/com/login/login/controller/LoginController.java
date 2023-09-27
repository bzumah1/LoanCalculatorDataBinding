package com.login.login.controller;

import com.login.login.Application;
import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.util.Duration;

import java.io.IOException;


public class LoginController {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button button;
    @FXML
    private Label message;

    String user = "Kushal";
    String pass = "Pandey";
    Application app = new Application();

    public void userLogin(ActionEvent event) throws Exception{
        checkLogin();

    }
    public void signUpLinkClick() throws Exception {
        app.changeScene("register.fxml");           // go to Register page on clicking the 'sign up' link


    }
    public void enterToLogin(){
        password.setOnKeyPressed(k -> {
            if(k.getCode() == KeyCode.ENTER){          // if you press Enter on password field
                button.fire();                         //   it will act as clicking the login button
            }
        });
    }

    public void checkLogin() throws Exception{

        if(username.getText().equals(user) && password.getText().equals(pass)){         // checks if username and password is correct
            message.setText("Login Successful !  Redirecting...");
            PauseTransition pause = new PauseTransition(Duration.seconds(2));       // waiting 2 seconds before proceeding

            pause.setOnFinished(event -> {                                            // what to do after 2 seconds has passed
                try {
                    app.changeScene("homePage.fxml");                           // changing the scene to the Home Page after login successful
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            pause.play();

        }
        else{
            message.setText("Please enter the correct credentials");                // display message if username or password is not correct
        }

    }

}