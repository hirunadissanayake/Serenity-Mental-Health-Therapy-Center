package lk.ijse.gdse.main.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.gdse.main.bo.BOFactory;
import lk.ijse.gdse.main.bo.custom.SignUpBO;
import lk.ijse.gdse.main.dto.UserDTO;
import lombok.SneakyThrows;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SidebarController implements Initializable {


    @FXML
    private AnchorPane ancLoading;

    @FXML
    private JFXButton btnDashboard;

    @FXML
    private JFXButton btnLogout;

    @FXML
    private JFXButton btnPatient;

    @FXML
    private JFXButton btnPayment;

    @FXML
    private JFXButton btnTherapist;

    @FXML
    private JFXButton btnTherapyPro;

    @FXML
    private JFXButton btnTherapySession;

    @FXML
    private JFXButton btnUser;

    @FXML
    private AnchorPane mainAnc;

    @SneakyThrows
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            ancLoading.getChildren().clear();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Dashboard1.fxml"));
            Parent load = loader.load();
            ancLoading.getChildren().add(load);
    }


    @FXML
    void btnDashboardOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/Dashboard1.fxml");

    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) throws IOException {
        btnDashboard.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
        Parent load = loader.load();
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnPatientOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/PatientForm.fxml");
    }

    @FXML
    void btnPaymentOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/PaymentsForm.fxml");
    }

    @FXML
    void btnTherapyProOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/TherapyProgramForm.fxml");
    }

    @FXML
    void btnTherapySessionOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/TherapySessionForm1.fxml");
    }

    @FXML
    void btnUserOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/UserForm.fxml");
    }
    public void navigateTo(String fxmlPath) throws IOException {
        try{
            ancLoading.getChildren().clear();
            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource(fxmlPath));
            ancLoading.getChildren().add(anchorPane);
        }catch (Exception e){
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR,"failed to load Page").show();
        }
    }

    public void btnRegisterOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/Registration.fxml");
    }

    public void btnTherapistOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/TherapistForm.fxml");
    }
}
