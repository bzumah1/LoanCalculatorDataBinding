module com.login.login {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires opencsv;


    opens com.login.login to javafx.fxml;
    exports com.login.login;
    exports com.login.login.controller;
    opens com.login.login.controller to javafx.fxml;
    exports com.login.login.model;
    opens com.login.login.model to javafx.fxml;
}