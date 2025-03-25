package lk.ijse.gdse.main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class PatientController {

    @FXML
    private ComboBox<?> CmbTherapyPrograms;

    @FXML
    private TextField TxtUpfrontPayment;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnSearch;

    @FXML
    private Button btnUpdate;

    @FXML
    private ToggleGroup genderGroup;

    @FXML
    private Text lblCustomerId;

    @FXML
    private RadioButton rbFemale;

    @FXML
    private RadioButton rbMale;

    @FXML
    private AnchorPane root;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtDOB;

    @FXML
    private TextField txtMedicalHistory;

    @FXML
    private TextField txtName;

    @FXML
    void AddBtnOnClickAction(ActionEvent event) {

    }

    @FXML
    void CmbTherapyProgramsOnAction(ActionEvent event) {

    }

    @FXML
    void DeleteBtnOnClickAction(ActionEvent event) {

    }

    @FXML
    void UpdateBtnOnClickAction(ActionEvent event) {

    }

    @FXML
    void btnResetOnAction(ActionEvent event) {

    }

}
