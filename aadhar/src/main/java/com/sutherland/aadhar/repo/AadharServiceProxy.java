package com.sutherland.aadhar.repo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sutherland.aadhar.dto.AadharDetailsDTO;  

@FeignClient(name = "aadhar-service")  
public interface AadharServiceProxy {

    @GetMapping(value = "/aadhar/verify/{aadharNumber}")  
    AadharDetailsDTO getAadharDetails(@PathVariable String aadharNumber);
}
