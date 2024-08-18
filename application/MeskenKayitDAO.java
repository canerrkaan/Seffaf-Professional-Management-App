package application.dao;

import application.MeskenKayit;
import application.Tenant;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MeskenKayitDAO {

    private final Connection connection;

    public MeskenKayitDAO(Connection connection) {
        this.connection = connection;
    }

    // Create a new MeskenKayit record in the database
    public void createMeskenKayit(MeskenKayit meskenKayit) throws SQLException {
        String query = "INSERT INTO MeskenKayit (meskenNo, nameOfTenant, surname, partnerName, tcNo, taxPlace, taxNo, bloodType, address, city, state, email, gsm, postaKodu, dateIn, dateOut) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, meskenKayit.getMeskenNo());

            Tenant tenant = meskenKayit.getTenant();
            statement.setString(2, tenant.getNameOfTenant());
            statement.setString(3, tenant.getSurname());
            statement.setString(4, tenant.getPartnerName());
            statement.setInt(5, tenant.getTCNo());
            statement.setString(6, tenant.getTaxPlace());
            statement.setInt(7, tenant.getTaxNo());
            statement.setString(8, tenant.getBloodType());
            statement.setString(9, tenant.getAddress());
            statement.setString(10, tenant.getCity());
            statement.setString(11, tenant.getState());
            statement.setString(12, tenant.getEmail());
            statement.setString(13, tenant.getPhoneNumber());
            statement.setString(14, tenant.getPostaKodu());
            statement.setString(15, tenant.getDateIn());
            statement.setString(16, tenant.getDateOut());

            statement.executeUpdate();
        }
    }

    // Read all MeskenKayit records from the database
    public List<MeskenKayit> getAllMeskenKayitlar() throws SQLException {
        List<MeskenKayit> meskenKayitlar = new ArrayList<>();
        String query = "SELECT * FROM MeskenKayit";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                MeskenKayit meskenKayit = new MeskenKayit();
                meskenKayit.setMeskenNo(resultSet.getString("meskenNo"));

                Tenant tenant = meskenKayit.getTenant();
                tenant.setNameOfTenant(resultSet.getString("nameOfTenant"));
                tenant.setSurname(resultSet.getString("surname"));
                tenant.setPartnerName(resultSet.getString("partnerName"));
                tenant.setTCNo(resultSet.getInt("tcNo"));
                tenant.setTaxPlace(resultSet.getString("taxPlace"));
                tenant.setTaxNo(resultSet.getInt("taxNo"));
                tenant.setBloodType(resultSet.getString("bloodType"));
                tenant.setAddress(resultSet.getString("address"));
                tenant.setCity(resultSet.getString("city"));
                tenant.setState(resultSet.getString("state"));
                tenant.setEmail(resultSet.getString("email"));
                tenant.setPhoneNumber(resultSet.getString("gsm"));
                tenant.setPostaKodu(resultSet.getString("postaKodu"));
                tenant.setDateIn(resultSet.getString("dateIn"));
                tenant.setDateOut(resultSet.getString("dateOut"));

                meskenKayitlar.add(meskenKayit);
            }
        }

        return meskenKayitlar;
    }

    // Update an existing MeskenKayit record in the database
    public void updateMeskenKayit(MeskenKayit meskenKayit) throws SQLException {
        String query = "UPDATE MeskenKayit SET nameOfTenant = ?, surname = ?, partnerName = ?, tcNo = ?, taxPlace = ?, taxNo = ?, bloodType = ?, address = ?, city = ?, state = ?, email = ?, gsm = ?, postaKodu = ?, dateIn = ?, dateOut = ? WHERE meskenNo = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            Tenant tenant = meskenKayit.getTenant();
            statement.setString(1, tenant.getNameOfTenant());
            statement.setString(2, tenant.getSurname());
            statement.setString(3, tenant.getPartnerName());
            statement.setInt(4, tenant.getTCNo());
            statement.setString(5, tenant.getTaxPlace());
            statement.setInt(6, tenant.getTaxNo());
            statement.setString(7, tenant.getBloodType());
            statement.setString(8, tenant.getAddress());
            statement.setString(9, tenant.getCity());
            statement.setString(10, tenant.getState());
            statement.setString(11, tenant.getEmail());
            statement.setString(12, tenant.getPhoneNumber());
            statement.setString(13, tenant.getPostaKodu());
            statement.setString(14, tenant.getDateIn());
            statement.setString(15, tenant.getDateOut());
            statement.setString(16, meskenKayit.getMeskenNo());

            statement.executeUpdate();
        }
    }

    // Delete a MeskenKayit record from the database
    public void deleteMeskenKayit(String meskenNo) throws SQLException {
        String query = "DELETE FROM MeskenKayit WHERE meskenNo = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, meskenNo);
            statement.executeUpdate();
        }
    }
}
