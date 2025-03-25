package lk.ijse.gdse.main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInController {

    @FXML
    private Button BtnCreateAcc;

    @FXML
    private Hyperlink BtnForgotPwd;

    @FXML
    private Button BtnLogIN;

    @FXML
    private AnchorPane LogInAnc;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPassword;

    @FXML
    void createAnAccountOnAction(ActionEvent event) throws IOException {
        setUi(event,"SignUp");
    }

    @FXML
    void forgotPasswordOnAction(ActionEvent event) throws IOException {
        setUi(event, "ForgotPwd");
    }

    @FXML
    void loginOnAction(ActionEvent event) {

    }

    private void setUi(ActionEvent event, String location) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/" + location + ".fxml"));
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(anchorPane));
        currentStage.show();
    }

}
