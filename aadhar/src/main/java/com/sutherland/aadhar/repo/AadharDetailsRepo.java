package com.sutherland.aadhar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sutherland.aadhar.entity.AadharDetails;

import java.util.Optional;

@Repository
public interface AadharDetailsRepo extends JpaRepository<AadharDetails, Integer> {
    Optional<AadharDetails> findByAadharNumber(String aadharNumber);

	
}
