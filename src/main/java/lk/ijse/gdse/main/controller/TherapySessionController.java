package lk.ijse.gdse.main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class TherapySessionController {

    @FXML
    private Button BtnAvailability;

    @FXML
    private Button BtnCancelAppoinment;

    @FXML
    private Button BtnMakeAppoinment;

    @FXML
    private Button BtnRescheduleAppoinment;

    @FXML
    private ComboBox<?> CmbTherapist;

    @FXML
    private ComboBox<?> CmbTherapyPrograms;

    @FXML
    private TableColumn<?, ?> ColDate;

    @FXML
    private TableColumn<?, ?> ColId;

    @FXML
    private TableColumn<?, ?> ColName;

    @FXML
    private TableColumn<?, ?> ColStatus;

    @FXML
    private TableColumn<?, ?> ColTherapist;

    @FXML
    private TableColumn<?, ?> ColTherapyProgram;

    @FXML
    private TextField IdtPatientId;

    @FXML
    private TableView<?> TblSessionAppoinmnets;

    @FXML
    private DatePicker TxtAppoinmentDate;

    @FXML
    private Text TxtDate;

    @FXML
    private Text TxtId;

    @FXML
    private TextField TxtPatientName;

    @FXML
    private AnchorPane root;

    @FXML
    void BtnAvailabilityOnAction(ActionEvent event) {

    }

    @FXML
    void BtnCancelAppoinmentOnAction(ActionEvent event) {

    }

    @FXML
    void BtnMakeAppoinmentOnAction(ActionEvent event) {

    }

    @FXML
    void BtnRescheduleAppoinmentOnAction(ActionEvent event) {

    }

    @FXML
    void CmbTherapyProgramsOnAction(ActionEvent event) {

    }

    @FXML
    void TblSessionAppoinmnetsOnAction(MouseEvent event) {

    }

}
