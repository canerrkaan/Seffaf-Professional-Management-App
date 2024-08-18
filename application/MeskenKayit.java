package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MeskenKayit {

    private final StringProperty meskenNo;
    private final Tenant tenant;

    public MeskenKayit() {
        this.meskenNo = new SimpleStringProperty();
        this.tenant = new Tenant.TenantBuilder().build(); // Creating a new Tenant instance
    }

    // Getter and Setter for meskenNo
    public String getMeskenNo() {
        return meskenNo.get();
    }

    public void setMeskenNo(String meskenNo) {
        this.meskenNo.set(meskenNo);
    }

    public StringProperty meskenNoProperty() {
        return meskenNo;
    }

    // Getter for Tenant (No Setter, as Tenant should be managed via its own builder)
    public Tenant getTenant() {
        return tenant;
    }
}
