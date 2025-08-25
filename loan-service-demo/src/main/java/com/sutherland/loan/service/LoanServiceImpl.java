package com.sutherland.loan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sutherland.loan.entity.LoanApplication;
import com.sutherland.loan.repo.LoanRepository;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository repo;

    @Override
    public void addLoanApplication(LoanApplication loan) {
        repo.save(loan);
    }

    @Override
    public List<LoanApplication> getAllLoanApplications() {
        return repo.findAll();
    }

    @Override
    public LoanApplication getLoanByPancard(String pancard) {
        return repo.findByPancard(pancard);
    }

    @Override
    public LoanApplication getLoanById(int loanid) {
        Optional<LoanApplication> loan = repo.findById(loanid);
        return loan.orElse(null);
    }
}

