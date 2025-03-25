package lk.ijse.gdse.main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class PayemntController {

    @FXML
    private Text TextDate;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnInvoice;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnUpdate;

    @FXML
    private Label lblCustomerId;

    @FXML
    private ToggleGroup paymentStatusGroup;

    @FXML
    private ToggleGroup paymentTypeGroup;

    @FXML
    private RadioButton rbCard;

    @FXML
    private RadioButton rbCash;

    @FXML
    private RadioButton rbComplete;

    @FXML
    private RadioButton rbOnline;

    @FXML
    private RadioButton rbPending;

    @FXML
    private AnchorPane root;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextField txtSessionId;

    @FXML
    void AddBtnOnClickAction(ActionEvent event) {

    }

    @FXML
    void DeleteBtnOnClickAction(ActionEvent event) {

    }

    @FXML
    void InvoiceBtnOnClickAction(ActionEvent event) {

    }

    @FXML
    void UpdateBtnOnClickAction(ActionEvent event) {

    }

    @FXML
    void btnResetOnAction(ActionEvent event) {

    }

}
