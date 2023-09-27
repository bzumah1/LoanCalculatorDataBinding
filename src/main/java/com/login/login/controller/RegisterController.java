package com.login.login.controller;

import com.login.login.Application;
import com.opencsv.CSVWriter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.FileWriter;
import java.io.IOException;

public class RegisterController {


    @FXML
    private Button button;
    @FXML
    private Hyperlink link;
    @FXML
    private ComboBox<String> gender;
    @FXML
    private TextField username,userEmail;
    @FXML
    private PasswordField userPassword;


    Application app = new Application();


    public void initialize() throws Exception{
        gender.getItems().addAll("Male", "Female","Others");           // setting up the drop down menu for selecting gender

    }

    public void goToLogin() throws IOException {
        app.changeScene("login.fxml");                              // changes the scene from register page to login page
    }

    public void onRegisterButtonClick(){
        String userName = username.getText();                             //
        String password = userPassword.getText();                        // get input from user
        String email = userEmail.getText();                             //
        String pathToCSV = "src/main/resources/userData.csv";          // set where you want to create the file

        try{                                                                        // exception handling must be done for CSVWriter
            FileWriter fileWriter = new FileWriter(pathToCSV,true);         // if the file doesn't exist, creates a new file
            CSVWriter csvWriter = new CSVWriter(fileWriter);                       // to write into the csv file
            String[] userData = {userName, email,password};                        // passing array of elements to be written in the file
            csvWriter.writeNext(userData);                                         // writes the values into the file
            csvWriter.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
    public void showRegisteredAlert(){


    }


}
