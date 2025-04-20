package lk.ijse.gdse.main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import lk.ijse.gdse.main.bo.BOFactory;
import lk.ijse.gdse.main.bo.SuperBO;
import lk.ijse.gdse.main.bo.custom.SignUpBO;
import lk.ijse.gdse.main.dto.UserDTO;

import java.io.IOException;
import java.util.List;

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
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    SignUpBO loginBo = (SignUpBO) BOFactory.getInstance().getBO(BOFactory.type.SIGNUP);
    @FXML
    void createAnAccountOnAction(ActionEvent event) throws IOException {
        setUi(event,"SignUp");
    }

    @FXML
    void forgotPasswordOnAction(ActionEvent event) throws IOException {
        setUi(event, "ForgotPwd");
    }

    @FXML
    void loginOnAction(ActionEvent event) throws IOException {
        String name = txtUserName.getText();
        String password = txtPassword.getText();
        boolean isAvailable = loginBo.checkCredentials(name, password);
        if(isAvailable){
            List<UserDTO> userDTOS = loginBo.checkRole(name, password);
            System.out.println(userDTOS.get(0).getRole());
            if(userDTOS.get(0).getRole().toLowerCase().equals("admin")){
                txtUserName.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Sidebar.fxml"));

                Parent load = loader.load();
                Scene scene = new Scene(load);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            } else {
                txtUserName.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Sidebar2.fxml"));

                Parent load = loader.load();
                Scene scene = new Scene(load);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }

        } else {
            new Alert(Alert.AlertType.INFORMATION,"Invalid Credentials").show();
        }

    }

    private void setUi(ActionEvent event, String location) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/" + location + ".fxml"));
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(anchorPane));
        currentStage.show();
    }

}
