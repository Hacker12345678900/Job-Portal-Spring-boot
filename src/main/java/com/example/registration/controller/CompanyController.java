package com.example.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.entity.Company;
import com.example.registration.entity.JobApplication;
import com.example.registration.service.CompanyDao;
import com.example.registration.service.CompanyService;

@RestController
public class CompanyController {
	
	@Autowired
	CompanyDao CompanyDAO;
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private JavaMailSender javaMailSender;
		
	
	
	@PostMapping("/registerCompany")
	public ResponseEntity<?> registerCompany(@RequestBody Company company) {
		return companyService.saveCompany(company);
	}
	
	@RequestMapping("/getAllCompanys")
	public List<Company> getAllCompanys() {
		return CompanyDAO.getAllCompany();
	}
	
	@GetMapping("/getCompanyById/{companyId}")
	public Company getCompanyById(@PathVariable("companyId") int companyId) {
		Company company = CompanyDAO.getCompanyById(companyId);
		
		if (company != null)
			return company;
		
		return new Company("Company Not Found!!!");
	}	

	@PutMapping("/updateCompany")
	public String updateCompany(@RequestBody Company company) {
		CompanyDAO.updateCompany(company);
		return "Company Updated Successfully";
	}
	
	@DeleteMapping("/deleteCompany/{companyId}")
	public String deleteCompany(@PathVariable("companyId") int companyId) {
		CompanyDAO.deleteCompany(companyId);
		return "Company " + companyId + " Deleted Successfully!!!";
	}
	
	@PostMapping("/sendResultEmail")
	public ResponseEntity<?> sendResultEmail(@RequestBody JobApplication company) {
		
	SimpleMailMessage mailMessage = new SimpleMailMessage();
	mailMessage.setTo(company.getEmailId());
	mailMessage.setFrom("vamsivickey312@gmail.com");
    mailMessage.setSubject("Congralutions You are selected fron interview");
    mailMessage.setText(" Hello /n Thankyou for participating in our recruitment process. + '\n' +  Congratulations you have been shortlisted and moved ahead in our recruitment process.Stay connected. + '\n' +  In case any queries please contact to vamsivickey312@gmail.com");

    javaMailSender.send(mailMessage);

    
    return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
	
	@PostMapping("/sendRejectedEmail")
	public ResponseEntity<?> sendRejectedEmail(@RequestBody JobApplication company) {
		
	SimpleMailMessage mailMessage = new SimpleMailMessage();
	mailMessage.setTo(company.getEmailId());
	mailMessage.setFrom("vamsivickey312@gmail.com");
    mailMessage.setSubject("Better luck next time You are not selected fro interview");
    mailMessage.setText(" Hello /n Thankyou for participating in our recruitment process.+ '\n' +  I regret to inform you that you have not been shortlisted. + '\n' +  You will not  be able to move further in our recruitment process. + '\n' +  In case any queries please contact vamsivickey312@gmail.com");
    javaMailSender.send(mailMessage);

    
    return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
}
