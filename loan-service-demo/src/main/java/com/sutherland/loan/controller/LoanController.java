package com.sutherland.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sutherland.loan.entity.LoanApplication;
import com.sutherland.loan.service.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private LoanService service;

   
    @PostMapping
    public ResponseEntity<String> addLoanApplication(@RequestBody LoanApplication loan) {
        service.addLoanApplication(loan);
        return new ResponseEntity<>("Loan application submitted.", HttpStatus.CREATED);
    }

    
    @GetMapping
    public ResponseEntity<List<LoanApplication>> getAllLoans() {
        List<LoanApplication> list = service.getAllLoanApplications();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

   
    @GetMapping("/bypancard/{pancard}")
    public ResponseEntity<LoanApplication> getLoanByPancard(@PathVariable String pancard) {
        LoanApplication loan = service.getLoanByPancard(pancard);
        return new ResponseEntity<>(loan, HttpStatus.OK);
    }

   
    @GetMapping("/byid/{loanid}")
    public ResponseEntity<LoanApplication> getLoanById(@PathVariable int loanid) {
        LoanApplication loan = service.getLoanById(loanid);
        return new ResponseEntity<>(loan, HttpStatus.OK);
    }
}
