CREATE TABLE loan_application (
    loanid INT AUTO_INCREMENT PRIMARY KEY,
    custName VARCHAR(100),
    email VARCHAR(100),
    mobileNo VARCHAR(15),
    monthlyIncome DECIMAL(10,2),
    loanAmount DECIMAL(12,2),
    pancard VARCHAR(10),
    creditScore INT,
    dateApplied DATE DEFAULT CURRENT_DATE,
    dateSanctioned DATE,
    loanStatus VARCHAR(20),
    remarks VARCHAR(255)
);


INSERT INTO loan_application (
    custName, 
    email, 
    mobileNo, 
    monthlyIncome, 
    loanAmount, 
    pancard, 
    creditScore, 
    dateApplied, 
    dateSanctioned, 
    loanStatus, 
    remarks
)
VALUES (
    'James Gosling', 
    'james.gosling@example.com', 
    '9876543210', 
    85000.00, 
    500000.00, 
    'ABCD12345', 
    500, 
    CURRENT_DATE, 
    '2025-08-12', 
    'Pending', 
    'Initial verification completed.'
);
