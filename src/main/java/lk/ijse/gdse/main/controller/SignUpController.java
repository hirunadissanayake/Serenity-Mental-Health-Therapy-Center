package lk.ijse.gdse.main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpController {

    @FXML
    private AnchorPane ancSignUp;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtFirstName;

    @FXML
    private TextField txtLastName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    void alreadyHaveAnAccountOnAction(ActionEvent event) throws IOException {
        setUi("/view/LogIn.fxml");
    }

    @FXML
    void signUpOnAction(ActionEvent event) {

    }
    private void setUi(String location) throws IOException {
        Stage stage = (Stage) ancSignUp.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource(location))));
        stage.centerOnScreen();
    }

}
