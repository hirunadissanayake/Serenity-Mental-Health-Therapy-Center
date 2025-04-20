package lk.ijse.gdse.main.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import lk.ijse.gdse.main.bo.BOFactory;
import lk.ijse.gdse.main.bo.SuperBO;
import lk.ijse.gdse.main.bo.custom.PatientBO;
import lk.ijse.gdse.main.dto.PatientDTO;
import lk.ijse.gdse.main.tm.PatientTm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class PatientController implements Initializable {

    private static final Log log = LogFactory.getLog(PatientController.class);
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
    private TextField txtContact;

    @FXML
    private TextField txtDOB;


    @FXML
    private TextField txtMedicalHistory;

    @FXML
    private TextField txtName;

    @FXML
    private TableColumn<PatientTm, String> colContact;

    @FXML
    private TableColumn<PatientTm, String> colDOB;

    @FXML
    private TableColumn<PatientTm, String> colGender;

    @FXML
    private TableColumn<PatientTm, String> colMediHistory;

    @FXML
    private TableColumn<PatientTm, String> colName;

    @FXML
    private TableColumn<PatientTm, String> colPatientId;

    @FXML
    private TableView<PatientTm> tableView;

    PatientBO patientbo = (PatientBO) BOFactory.getInstance().getBO(BOFactory.type.PATIENT);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadTables();
        loadNextId();
    }

    private void loadNextId() {
        String id = patientbo.loadNextId();
        lblCustomerId.setText(id);
    }

    private void loadTables() {
        colPatientId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colDOB.setCellValueFactory(new PropertyValueFactory<>("dob"));
        colGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        colMediHistory.setCellValueFactory(new PropertyValueFactory<>("medicalHistory"));

        List<PatientDTO> allPatient = patientbo.getAllPatient();
        ObservableList<PatientTm> objects = FXCollections.observableArrayList();
        for (PatientDTO patient : allPatient) {
            System.out.println("aaaaaaaaaaaaaaaammmm"+patient.toString());
            objects.add(new PatientTm(patient.getId(),patient.getName(),patient.getDob(),patient.getGender(),patient.getContact(),patient.getMedicalHistory()));
        }

        tableView.setItems(objects);
    }

    @FXML
    void AddBtnOnClickAction(ActionEvent event) {
        String id = lblCustomerId.getText();
        String name = txtName.getText();
        String medicalHistory = txtMedicalHistory.getText();
        String contact = txtContact.getText();
        String dob = txtDOB.getText();
        boolean selected = rbMale.isSelected();
        String gender = "Female";
        if (selected) {
            gender = "Male";
        }

        boolean isSave = patientbo.savePatient(new PatientDTO(id,name, dob, gender, contact, medicalHistory));
        if (isSave) {
            new Alert(Alert.AlertType.INFORMATION, "Patient Saved", ButtonType.OK).show();
            refreshPage();
            loadTables();
        } else {
            new Alert(Alert.AlertType.ERROR, "Patient Not Saved", ButtonType.OK).show();
        }
    }

    @FXML
    void DeleteBtnOnClickAction(ActionEvent event) {
        String id = lblCustomerId.getText();
        boolean isDelete = patientbo.deletePatient(id);
        if (isDelete) {
            new Alert(Alert.AlertType.INFORMATION, "Patient Delete", ButtonType.OK).show();
            refreshPage();
            loadTables();
        } else {
            new Alert(Alert.AlertType.ERROR, "Patient Not Deleted", ButtonType.OK).show();
        }
    }

    @FXML
    void UpdateBtnOnClickAction(ActionEvent event) {
        String id = lblCustomerId.getText();
        String name = txtName.getText();
        String medicalHistory = txtMedicalHistory.getText();
        String contact = txtContact.getText();
        String dob = txtDOB.getText();
        boolean selected = rbMale.isSelected();
        String gender = "Female";
        if (selected) {
            gender = "Male";
        }

        boolean isUpdate = patientbo.updatePatient(new PatientDTO(id ,name, dob, gender, contact, medicalHistory));
        if (isUpdate) {
            new Alert(Alert.AlertType.INFORMATION, "Patient Updated", ButtonType.OK).show();
            refreshPage();
            loadTables();
        } else {
            new Alert(Alert.AlertType.ERROR, "Patient Not Updated", ButtonType.OK).show();
        }
    }

    @FXML
    void btnResetOnAction(ActionEvent event) {
       refreshPage();
    }

    public void refreshPage(){
        rbMale.setSelected(true);
        rbFemale.setSelected(false);
        txtName.clear();
        txtMedicalHistory.clear();
        txtContact.clear();
        txtDOB.clear();
        loadNextId();
    }

    public void loadDataMouseClickOnAction(MouseEvent mouseEvent) {
        PatientTm selectedItem = tableView.getSelectionModel().getSelectedItem();
        lblCustomerId.setText(selectedItem.getId());
        txtName.setText(selectedItem.getName());
        txtContact.setText(selectedItem.getContact());
        txtDOB.setText(selectedItem.getDob());
        txtMedicalHistory.setText(selectedItem.getMedicalHistory());
        String gender = selectedItem.getGender();

        if (gender.equals("Female")) {
            rbFemale.setSelected(true);
        } else {
            rbMale.setSelected(true);
        }
    }
}
