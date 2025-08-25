package com.sutherland.loan.service;

import java.util.List;

import com.sutherland.loan.entity.LoanApplication;

public interface LoanService {

    void addLoanApplication(LoanApplication loan);

    List<LoanApplication> getAllLoanApplications();

    LoanApplication getLoanByPancard(String pancard);

    LoanApplication getLoanById(int loanid);
}
