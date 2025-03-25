package lk.ijse.gdse.main.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SidebarController {

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

    @FXML
    void btnDashboardOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/Dashboard1.fxml");

    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/LogOut.fxml");
    }

    @FXML
    void btnPatientOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/Patient.fxml");
    }

    @FXML
    void btnPaymentOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/Payment.fxml");
    }

    @FXML
    void btnTherapyProOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/TherapyPro.fxml");
    }

    @FXML
    void btnTherapySessionOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/TherapySession.fxml");
    }

    @FXML
    void btnUserOnAction(ActionEvent event) throws IOException {
        navigateTo("view/User.fxml");
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

}
