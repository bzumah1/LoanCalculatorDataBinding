package com.login.login.controller;

import com.login.login.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class HomePageController {

    @FXML
    private Button goBackButton;

    Application app = new Application();


    public void onGoBackButtonClicked() throws IOException {
        goToLogin();
    }
    public void goToLogin() throws IOException {
        app.changeScene("login.fxml");
    }

}
