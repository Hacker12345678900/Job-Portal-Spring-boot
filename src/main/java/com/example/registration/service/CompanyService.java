package com.example.registration.service;

import org.springframework.http.ResponseEntity;

import com.example.registration.entity.Company;

public interface CompanyService {

    ResponseEntity<?> saveCompany(Company company);

    ResponseEntity<?> confirmEmail(String confirmationToken);
    
    
}