package com.example.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.entity.Company;
import com.example.registration.entity.User;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{

	Company findByCompanyEmailIgnoreCase(String emailId);

	    Boolean existsByCompanyEmail(String email);
}
