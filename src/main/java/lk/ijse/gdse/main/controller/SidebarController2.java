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
import lombok.SneakyThrows;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SidebarController2 implements Initializable {

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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Dashboard2.fxml"));
        Parent load = loader.load();
        ancLoading.getChildren().add(load);
    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/Dashboard2.fxml");
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
    void btnTherapyProOnAction(ActionEvent event) {

    }

    @FXML
    void btnTherapySessionOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/TherapySessionForm1.fxml");
    }

    @FXML
    void btnUserOnAction(ActionEvent event) {

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
}
