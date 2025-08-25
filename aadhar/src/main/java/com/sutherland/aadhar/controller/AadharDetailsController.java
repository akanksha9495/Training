package com.sutherland.aadhar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sutherland.aadhar.entity.AadharDetails;
import com.sutherland.aadhar.service.AadharDetailsService;

@RestController
@RequestMapping("/aadhar")
public class AadharDetailsController {

    @Autowired
    AadharDetailsService service;

    @PostMapping
    public ResponseEntity<String> registerAadhar(@RequestBody AadharDetails details) {
        int id = service.registerAadhar(details);
        return new ResponseEntity<>("Aadhar Registered. ID: " + id, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AadharDetails>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/verify/{aadharNumber}")
    public ResponseEntity<AadharDetails> verifyAadhar(@PathVariable String aadharNumber) {
        AadharDetails details = service.verifyAadhar(aadharNumber);
        if (details != null) {
            return new ResponseEntity<>(details, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
