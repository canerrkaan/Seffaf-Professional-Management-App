package application;

public class ExpenseCode {
    private String groupCode;           // Grup Kodu
    private String expenseCode;         // Cari Kodu
    private String companyName;         // Firma Adi
    private String authorizedByName;    // Yetkili Adi
    private String authorizedByLastName;// Yetkili Soyadi
    private String taxPlace;            // Vergi Dairesi
    private int taxNo;                  // Vergi No
    private String bankName;            // Banka Adi
    private int IBANNo;                 // IBAN No
    private String addressOfCompany;    // Adres Bilgileri
    private String phoneNumberOfCompany;// Telefon Numarasi
    private String emailOfCompany;      // E-posta
    private String province;            // İl
    private String city;                // İlçe
    private String web;                 // Web Adresi
    private double giren;               // Giren (Incoming)
    private double cikan;               // Çıkan (Outgoing)
    private double bakiye;              // Bakiye (Balance)

    // Private constructor to prevent direct instantiation
    private ExpenseCode(ExpenseCodeBuilder builder) {
        this.groupCode = builder.groupCode;
        this.expenseCode = builder.expenseCode;
        this.companyName = builder.companyName;
        this.authorizedByName = builder.authorizedByName;
        this.authorizedByLastName = builder.authorizedByLastName;
        this.taxPlace = builder.taxPlace;
        this.taxNo = builder.taxNo;
        this.bankName = builder.bankName;
        this.IBANNo = builder.IBANNo;
        this.addressOfCompany = builder.addressOfCompany;
        this.phoneNumberOfCompany = builder.phoneNumberOfCompany;
        this.emailOfCompany = builder.emailOfCompany;
        this.province = builder.province;
        this.city = builder.city;
        this.web = builder.web;
        this.giren = builder.giren;
        this.cikan = builder.cikan;
        this.bakiye = builder.bakiye;
    }

    // Builder Class
    public static class ExpenseCodeBuilder {
        private String groupCode;
        private String expenseCode;
        private String companyName;
        private String authorizedByName;
        private String authorizedByLastName;
        private String taxPlace;
        private int taxNo;
        private String bankName;
        private int IBANNo;
        private String addressOfCompany;
        private String phoneNumberOfCompany;
        private String emailOfCompany;
        private String province;
        private String city;
        private String web;
        private double giren;    // Incoming
        private double cikan;    // Outgoing
        private double bakiye;   // Balance

        // Constructor with mandatory fields
        public ExpenseCodeBuilder(String groupCode, String expenseCode) {
            this.groupCode = groupCode;
            this.expenseCode = expenseCode;
        }

        // Setters for optional fields
        public ExpenseCodeBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public ExpenseCodeBuilder setAuthorizedByName(String authorizedByName) {
            this.authorizedByName = authorizedByName;
            return this;
        }

        public ExpenseCodeBuilder setAuthorizedByLastName(String authorizedByLastName) {
            this.authorizedByLastName = authorizedByLastName;
            return this;
        }

        public ExpenseCodeBuilder setTaxPlace(String taxPlace) {
            this.taxPlace = taxPlace;
            return this;
        }

        public ExpenseCodeBuilder setTaxNo(int taxNo) {
            this.taxNo = taxNo;
            return this;
        }

        public ExpenseCodeBuilder setBankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public ExpenseCodeBuilder setIBANNo(int IBANNo) {
            this.IBANNo = IBANNo;
            return this;
        }

        public ExpenseCodeBuilder setAddressOfCompany(String addressOfCompany) {
            this.addressOfCompany = addressOfCompany;
            return this;
        }

        public ExpenseCodeBuilder setPhoneNumberOfCompany(String phoneNumberOfCompany) {
            this.phoneNumberOfCompany = phoneNumberOfCompany;
            return this;
        }

        public ExpenseCodeBuilder setEmailOfCompany(String emailOfCompany) {
            this.emailOfCompany = emailOfCompany;
            return this;
        }

        public ExpenseCodeBuilder setProvince(String province) {
            this.province = province;
            return this;
        }

        public ExpenseCodeBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public ExpenseCodeBuilder setWeb(String web) {
            this.web = web;
            return this;
        }

        public ExpenseCodeBuilder setGiren(double giren) {
            this.giren = giren;
            return this;
        }

        public ExpenseCodeBuilder setCikan(double cikan) {
            this.cikan = cikan;
            return this;
        }

        public ExpenseCodeBuilder setBakiye(double bakiye) {
            this.bakiye = bakiye;
            return this;
        }

        public ExpenseCode build() {
            return new ExpenseCode(this);
        }
    }

    @Override
    public String toString() {
        return "ExpenseCode{" +
                "groupCode='" + groupCode + '\'' +
                ", expenseCode='" + expenseCode + '\'' +
                ", companyName='" + companyName + '\'' +
                ", authorizedByName='" + authorizedByName + '\'' +
                ", authorizedByLastName='" + authorizedByLastName + '\'' +
                ", taxPlace='" + taxPlace + '\'' +
                ", taxNo=" + taxNo +
                ", bankName='" + bankName + '\'' +
                ", IBANNo=" + IBANNo +
                ", addressOfCompany='" + addressOfCompany + '\'' +
                ", phoneNumberOfCompany='" + phoneNumberOfCompany + '\'' +
                ", emailOfCompany='" + emailOfCompany + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", web='" + web + '\'' +
                ", giren=" + giren +
                ", cikan=" + cikan +
                ", bakiye=" + bakiye +
                '}';
    }
}
