package lk.ijse.gdse.main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ForgotPwdController {
    public void sendCodeOnAction(ActionEvent event) throws IOException {
    }

    public void backToLoginPage(ActionEvent event) throws IOException {
        setUi(event,"Login");
    }

    private void setUi(ActionEvent event, String location) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/" + location + ".fxml"));
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(anchorPane));
        currentStage.show();
    }
}
