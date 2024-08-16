CREATE DATABASE ExpenseManagement;
USE ExpenseManagement;

CREATE TABLE ExpenseCode (
    id INT AUTO_INCREMENT PRIMARY KEY,
    groupCode VARCHAR(50),
    expenseCode VARCHAR(50),
    companyName VARCHAR(100),
    authorizedByName VARCHAR(50),
    authorizedByLastName VARCHAR(50),
    taxPlace VARCHAR(100),
    taxNo INT,
    bankName VARCHAR(100),
    IBANNo VARCHAR(34),
    addressOfCompany VARCHAR(255),
    phoneNumberOfCompany VARCHAR(15),
    emailOfCompany VARCHAR(100),
    province VARCHAR(50),
    city VARCHAR(50),
    web VARCHAR(100),
    giren DOUBLE,
    cikan DOUBLE,
    bakiye DOUBLE
);

INSERT INTO ExpenseCode (groupCode, expenseCode, companyName, authorizedByName, authorizedByLastName, taxPlace, taxNo, bankName, IBANNo, addressOfCompany, phoneNumberOfCompany, emailOfCompany, province, city, web, giren, cikan, bakiye)
VALUES 
('GRP01', 'EXP01', 'Company A', 'John', 'Doe', 'TaxPlace A', 123456, 'Bank A', 'TR330006100519786457841326', '123 Street', '555-1234', 'companya@example.com', 'Province A', 'City A', 'www.companya.com', 10000.00, 5000.00, 5000.00),
('GRP02', 'EXP02', 'Company B', 'Jane', 'Smith', 'TaxPlace B', 789012, 'Bank B', 'TR330006100519786457841327', '456 Avenue', '555-5678', 'companyb@example.com', 'Province B', 'City B', 'www.companyb.com', 20000.00, 15000.00, 5000.00);
