package application.Controllers;

import application.MeskenKayit;
import application.Tenant;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MeskenKayitController {

    @FXML
    private TextField meskenNoField;
    @FXML
    private TextField adiField;
    @FXML
    private TextField soyadiField;
    @FXML
    private TextField esininAdiField;
    @FXML
    private TextField tcKimlikNoField;
    @FXML
    private TextField vergiDairesiField;
    @FXML
    private TextField vergiNoField;
    @FXML
    private TextField kanGrubuField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField cityField;
    @FXML
    private TextField stateField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField gsmField;
    @FXML
    private TextField postaKoduField;
    @FXML
    private TextField girisTarihiField;
    @FXML
    private TextField cikisTarihiField;
    
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

    private MeskenKayit meskenKayit;

    public void initialize() {
        // Assuming meskenKayit is created/loaded elsewhere and set here
        meskenKayit = new MeskenKayit();
        
        bindFieldsToModel();
    }

    private void bindFieldsToModel() {
        // Binding Mesken No
        meskenNoField.textProperty().bindBidirectional(meskenKayit.meskenNoProperty());

        // Binding Tenant fields
        Tenant tenant = meskenKayit.getTenant();
        adiField.textProperty().bindBidirectional(tenant.nameOfTenantProperty());
        soyadiField.textProperty().bindBidirectional(tenant.surnameProperty());
        esininAdiField.textProperty().bindBidirectional(tenant.partnerNameProperty());
        tcKimlikNoField.textProperty().bindBidirectional(tenant.tcNoProperty().asString());
        vergiDairesiField.textProperty().bindBidirectional(tenant.taxPlaceProperty());
        vergiNoField.textProperty().bindBidirectional(tenant.taxNoProperty().asString());
        kanGrubuField.textProperty().bindBidirectional(tenant.bloodTypeProperty());
        addressField.textProperty().bindBidirectional(tenant.addressProperty());
        cityField.textProperty().bindBidirectional(tenant.cityProperty());
        stateField.textProperty().bindBidirectional(tenant.stateProperty());
        emailField.textProperty().bindBidirectional(tenant.emailProperty());
        gsmField.textProperty().bindBidirectional(tenant.phoneNumberProperty());
        postaKoduField.textProperty().bindBidirectional(tenant.postaKoduProperty());
        girisTarihiField.textProperty().bindBidirectional(tenant.dateInProperty());
        cikisTarihiField.textProperty().bindBidirectional(tenant.dateOutProperty());
    }
    
    @FXML
    private void handleSaveAction() {
        // Code to save meskenKayit data to the database
        // Example: Save meskenKayit to a database using your database connector class
    }

    @FXML
    private void handleDeleteAction() {
        // Code to delete the current meskenKayit data
    }

    @FXML
    private void handleNewAction() {
        // Code to create a new MeskenKayit instance and bind it to the fields
        meskenKayit = new MeskenKayit();
        bindFieldsToModel();
    }

    @FXML
    private void handleSearchAction() {
        // Code to search and load a meskenKayit from the database
    }

    @FXML
    private void handleHaraketlerAction() {
        // Code to handle additional actions, such as displaying movement details
    }

    @FXML
    private void handleEkstreAlAction() {
        // Code to handle actions like generating a report or statement
    }
}
