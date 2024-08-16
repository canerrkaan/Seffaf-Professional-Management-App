package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ExpenseCode {

    // Fields with JavaFX Property types
    private final IntegerProperty id = new SimpleIntegerProperty(); // Unique Identifier
    private final StringProperty groupCode = new SimpleStringProperty();
    private final StringProperty expenseCode = new SimpleStringProperty();
    private final StringProperty companyName = new SimpleStringProperty();
    private final StringProperty authorizedByName = new SimpleStringProperty();
    private final StringProperty authorizedByLastName = new SimpleStringProperty();
    private final StringProperty taxPlace = new SimpleStringProperty();
    private final IntegerProperty taxNo = new SimpleIntegerProperty();
    private final StringProperty bankName = new SimpleStringProperty();
    private final StringProperty IBANNo = new SimpleStringProperty();
    private final StringProperty addressOfCompany = new SimpleStringProperty();
    private final StringProperty phoneNumberOfCompany = new SimpleStringProperty();
    private final StringProperty emailOfCompany = new SimpleStringProperty();
    private final StringProperty province = new SimpleStringProperty();
    private final StringProperty city = new SimpleStringProperty();
    private final StringProperty web = new SimpleStringProperty();
    private final DoubleProperty giren = new SimpleDoubleProperty();
    private final DoubleProperty cikan = new SimpleDoubleProperty();
    private final DoubleProperty bakiye = new SimpleDoubleProperty();

    // Getters and Setters with Property methods

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public String getGroupCode() {
        return groupCode.get();
    }

    public void setGroupCode(String groupCode) {
        this.groupCode.set(groupCode);
    }

    public StringProperty groupCodeProperty() {
        return groupCode;
    }

    public String getExpenseCode() {
        return expenseCode.get();
    }

    public void setExpenseCode(String expenseCode) {
        this.expenseCode.set(expenseCode);
    }

    public StringProperty expenseCodeProperty() {
        return expenseCode;
    }

    public String getCompanyName() {
        return companyName.get();
    }

    public void setCompanyName(String companyName) {
        this.companyName.set(companyName);
    }

    public StringProperty companyNameProperty() {
        return companyName;
    }

    public String getAuthorizedByName() {
        return authorizedByName.get();
    }

    public void setAuthorizedByName(String authorizedByName) {
        this.authorizedByName.set(authorizedByName);
    }

    public StringProperty authorizedByNameProperty() {
        return authorizedByName;
    }

    public String getAuthorizedByLastName() {
        return authorizedByLastName.get();
    }

    public void setAuthorizedByLastName(String authorizedByLastName) {
        this.authorizedByLastName.set(authorizedByLastName);
    }

    public StringProperty authorizedByLastNameProperty() {
        return authorizedByLastName;
    }

    public String getTaxPlace() {
        return taxPlace.get();
    }

    public void setTaxPlace(String taxPlace) {
        this.taxPlace.set(taxPlace);
    }

    public StringProperty taxPlaceProperty() {
        return taxPlace;
    }

    public int getTaxNo() {
        return taxNo.get();
    }

    public void setTaxNo(int taxNo) {
        this.taxNo.set(taxNo);
    }

    public IntegerProperty taxNoProperty() {
        return taxNo;
    }

    public String getBankName() {
        return bankName.get();
    }

    public void setBankName(String bankName) {
        this.bankName.set(bankName);
    }

    public StringProperty bankNameProperty() {
        return bankName;
    }

    public String getIBANNo() {
        return IBANNo.get();
    }

    public void setIBANNo(String IBANNo) {
        this.IBANNo.set(IBANNo);
    }

    public StringProperty IBANNoProperty() {
        return IBANNo;
    }

    public String getAddressOfCompany() {
        return addressOfCompany.get();
    }

    public void setAddressOfCompany(String addressOfCompany) {
        this.addressOfCompany.set(addressOfCompany);
    }

    public StringProperty addressOfCompanyProperty() {
        return addressOfCompany;
    }

    public String getPhoneNumberOfCompany() {
        return phoneNumberOfCompany.get();
    }

    public void setPhoneNumberOfCompany(String phoneNumberOfCompany) {
        this.phoneNumberOfCompany.set(phoneNumberOfCompany);
    }

    public StringProperty phoneNumberOfCompanyProperty() {
        return phoneNumberOfCompany;
    }

    public String getEmailOfCompany() {
        return emailOfCompany.get();
    }

    public void setEmailOfCompany(String emailOfCompany) {
        this.emailOfCompany.set(emailOfCompany);
    }

    public StringProperty emailOfCompanyProperty() {
        return emailOfCompany;
    }

    public String getProvince() {
        return province.get();
    }

    public void setProvince(String province) {
        this.province.set(province);
    }

    public StringProperty provinceProperty() {
        return province;
    }

    public String getCity() {
        return city.get();
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public StringProperty cityProperty() {
        return city;
    }

    public String getWeb() {
        return web.get();
    }

    public void setWeb(String web) {
        this.web.set(web);
    }

    public StringProperty webProperty() {
        return web;
    }

    public double getGiren() {
        return giren.get();
    }

    public void setGiren(double giren) {
        this.giren.set(giren);
    }

    public DoubleProperty girenProperty() {
        return giren;
    }

    public double getCikan() {
        return cikan.get();
    }

    public void setCikan(double cikan) {
        this.cikan.set(cikan);
    }

    public DoubleProperty cikanProperty() {
        return cikan;
    }

    public double getBakiye() {
        return bakiye.get();
    }

    public void setBakiye(double bakiye) {
        this.bakiye.set(bakiye);
    }

    public DoubleProperty bakiyeProperty() {
        return bakiye;
    }
}
