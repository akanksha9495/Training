package com.sutherland.loan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sutherland.loan.entity.LoanApplication;

@Repository
public interface LoanRepository extends JpaRepository<LoanApplication, Integer> {

  
    LoanApplication findByPancard(String pancard);

}

