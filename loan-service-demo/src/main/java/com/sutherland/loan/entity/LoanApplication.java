package com.sutherland.loan.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanid;

    @Column(length = 100)
    private String custName;

    @Column(length = 100)
    private String email;

    @Column(length = 15)
    private String mobileNo;

    @Column
    private double monthlyIncome;

    @Column
    private double loanAmount;

    @Column(length = 10)
    private String pancard;

    @Column
    private int creditScore;

    @Column
    private LocalDate dateApplied = LocalDate.now();  // default to current date

    @Column
    private LocalDate dateSanctioned;

    @Column(length = 20)
    private String loanStatus;

    @Column(length = 255)
    private String remarks;

    // Getters and Setters

    public int getLoanid() {
        return loanid;
    }

    public void setLoanid(int loanid) {
        this.loanid = loanid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getPancard() {
        return pancard;
    }

    public void setPancard(String pancard) {
        this.pancard = pancard;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public LocalDate getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(LocalDate dateApplied) {
        this.dateApplied = dateApplied;
    }

    public LocalDate getDateSanctioned() {
        return dateSanctioned;
    }

    public void setDateSanctioned(LocalDate dateSanctioned) {
        this.dateSanctioned = dateSanctioned;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
