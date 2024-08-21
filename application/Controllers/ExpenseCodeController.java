package application.Controllers;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import application.ExpenseCode;
import application.dao.ExpenseCodeDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.converter.NumberStringConverter;

public class ExpenseCodeController {

    @FXML
    private TextField cariKoduField;
    @FXML
    private TextField grupKoduField;
    @FXML
    private TextField firmaAdiField;
    @FXML
    private TextField yetkiliAdiField;
    @FXML
    private TextField yetkiliSoyadiField;
    @FXML
    private TextField vergiDairesiField;
    @FXML
    private TextField vergiNoField;
    @FXML
    private TextField bankaAdiField;
    @FXML
    private TextField ibanNoField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField phoneNumberOfCompanyField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField provinceField;
    @FXML
    private TextField cityField;
    @FXML
    private TextField webField;
    @FXML
    private TextField girenField;
    @FXML
    private TextField cikanField;
    @FXML
    private TextField bakiyeField;

    @FXML
    private TableView<ExpenseCode> expenseCodeTable;
    @FXML
    private TableColumn<ExpenseCode, String> cariKoduColumn;
    @FXML
    private TableColumn<ExpenseCode, String> firmaAdiColumn;
    @FXML
    private TableColumn<ExpenseCode, String> adiColumn;
    @FXML
    private TableColumn<ExpenseCode, String> soyadiColumn;
    @FXML
    private TableColumn<ExpenseCode, String> grupKoduColumn;

    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;

    private ObservableList<ExpenseCode> expenseCodeList;
    private ExpenseCodeDAO expenseCodeDAO;

    @FXML
    public void initialize() {
        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExpenseManagement", "username", "password");
            expenseCodeDAO = new ExpenseCodeDAO(connection);

            // Load data from the database
            expenseCodeList = FXCollections.observableArrayList(expenseCodeDAO.getAllExpenseCodes());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Bind Table Columns to ExpenseCode properties
        cariKoduColumn.setCellValueFactory(new PropertyValueFactory<>("expenseCode"));
        firmaAdiColumn.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        adiColumn.setCellValueFactory(new PropertyValueFactory<>("authorizedByName"));
        soyadiColumn.setCellValueFactory(new PropertyValueFactory<>("authorizedByLastName"));
        grupKoduColumn.setCellValueFactory(new PropertyValueFactory<>("groupCode"));

        // Bind the TableView to the expenseCodeList
        expenseCodeTable.setItems(expenseCodeList);

        // Setup data bindings for the selected ExpenseCode
        expenseCodeTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                bindFields(newSelection);
            }
        });

        // Button actions
        button1.setOnAction(event -> addNewExpenseCode());
        button2.setOnAction(event -> deleteSelectedExpenseCode());
        button3.setOnAction(event -> saveChanges());
    }

    private void bindFields(ExpenseCode expenseCode) {
        cariKoduField.textProperty().bindBidirectional(expenseCode.expenseCodeProperty());
        grupKoduField.textProperty().bindBidirectional(expenseCode.groupCodeProperty());
        firmaAdiField.textProperty().bindBidirectional(expenseCode.companyNameProperty());
        yetkiliAdiField.textProperty().bindBidirectional(expenseCode.authorizedByNameProperty());
        yetkiliSoyadiField.textProperty().bindBidirectional(expenseCode.authorizedByLastNameProperty());
        vergiDairesiField.textProperty().bindBidirectional(expenseCode.taxPlaceProperty());
        vergiNoField.textProperty().bindBidirectional(expenseCode.taxNoProperty(), new NumberStringConverter());
        bankaAdiField.textProperty().bindBidirectional(expenseCode.bankNameProperty());
        ibanNoField.textProperty().bindBidirectional(expenseCode.IBANNoProperty());
        addressField.textProperty().bindBidirectional(expenseCode.addressOfCompanyProperty());
        phoneNumberOfCompanyField.textProperty().bindBidirectional(expenseCode.phoneNumberOfCompanyProperty());
        emailField.textProperty().bindBidirectional(expenseCode.emailOfCompanyProperty());
        provinceField.textProperty().bindBidirectional(expenseCode.provinceProperty());
        cityField.textProperty().bindBidirectional(expenseCode.cityProperty());
        webField.textProperty().bindBidirectional(expenseCode.webProperty());
        girenField.textProperty().bindBidirectional(expenseCode.girenProperty(), new NumberStringConverter());
        cikanField.textProperty().bindBidirectional(expenseCode.cikanProperty(), new NumberStringConverter());
        bakiyeField.textProperty().bindBidirectional(expenseCode.bakiyeProperty(), new NumberStringConverter());
    }

    private void addNewExpenseCode() {
        ExpenseCode newExpenseCode = new ExpenseCode();
        expenseCodeList.add(newExpenseCode);
        expenseCodeTable.getSelectionModel().select(newExpenseCode);
    }

    private void deleteSelectedExpenseCode() {
        ExpenseCode selectedExpenseCode = expenseCodeTable.getSelectionModel().getSelectedItem();
        if (selectedExpenseCode != null) {
            try {
                expenseCodeDAO.deleteExpenseCode(selectedExpenseCode.getId());
                expenseCodeList.remove(selectedExpenseCode);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveChanges() {
        ExpenseCode selectedExpenseCode = expenseCodeTable.getSelectionModel().getSelectedItem();
        if (selectedExpenseCode != null) {
            try {
                if (selectedExpenseCode.getId() == 0) {
                    expenseCodeDAO.createExpenseCode(selectedExpenseCode);
                } else {
                    expenseCodeDAO.updateExpenseCode(selectedExpenseCode);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
