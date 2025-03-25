package lk.ijse.gdse.main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class TherapyProgramController {

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
    private TableColumn<?, ?> colProgramDuration;

    @FXML
    private TableColumn<?, ?> colProgramFee;

    @FXML
    private TableColumn<?, ?> colProgramId;

    @FXML
    private TableColumn<?, ?> colProgramName;

    @FXML
    private Text lblProgramId;

    @FXML
    private AnchorPane root;

    @FXML
    private TableView<?> tblProgram;

    @FXML
    private TextField txtProgramDuration;

    @FXML
    private TextField txtProgramFee;

    @FXML
    private TextField txtProgramName;

    @FXML
    void AddBtnOnClickAction(ActionEvent event) {

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

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

}
