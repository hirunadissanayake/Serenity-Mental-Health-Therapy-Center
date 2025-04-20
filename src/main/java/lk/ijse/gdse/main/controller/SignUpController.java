package lk.ijse.gdse.main.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.gdse.main.bo.BOFactory;
import lk.ijse.gdse.main.bo.SuperBO;
import lk.ijse.gdse.main.bo.custom.SignUpBO;
import lk.ijse.gdse.main.dto.UserDTO;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {

    @FXML
    private AnchorPane ancSignUp;

    @FXML
    private PasswordField txtAdminCode;

    @FXML
    private TextField txtAdminName;

    @FXML
    private TextField txtEmail;

    @FXML
    private ComboBox<String> cmbUser;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void alreadyHaveAnAccountOnAction(ActionEvent event) throws IOException {
        setUi("/view/Login.fxml");
    }

    @FXML
    void signUpOnAction(ActionEvent event) throws IOException {
        SignUpBO signUpBO = (SignUpBO) BOFactory.getInstance().getBO(BOFactory.type.SIGNUP);

        String UserNAme = txtUserName.getText();
        String UserEmail = txtEmail.getText();
        String Password = txtPassword.getText();
        String Role = cmbUser.getValue().toString();
        String AdminName = txtAdminName.getText();
        String AdminCode = txtAdminCode.getText();

        boolean isSave = signUpBO.saveUser(new UserDTO(UserNAme, UserEmail, Password, Role, AdminName, AdminCode));

        if (isSave) {
            Optional<ButtonType> buttonType = new Alert(Alert.AlertType.INFORMATION, "Sign Up Successful!").showAndWait();
            if (buttonType.get() == ButtonType.OK) {
                txtUserName.getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
                Parent load = fxmlLoader.load();
                Scene scene = new Scene(load);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }

        } else  {
            new Alert(Alert.AlertType.INFORMATION,"Sign Up Failed!").show();
        }

    }
    private void setUi(String location) throws IOException {
        Stage stage = (Stage) ancSignUp.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource(location))));
        stage.centerOnScreen();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> objects = FXCollections.observableArrayList();
        objects.add("Admin");
        objects.add("Receptionist");

        cmbUser.setItems(objects);
    }
}
