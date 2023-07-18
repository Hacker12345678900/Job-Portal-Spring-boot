package com.example.registration.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.example.registration.entity.Company;
import com.example.registration.entity.ConfirmationToken;
import com.example.registration.entity.ConfirmationToken2;
import com.example.registration.repository.CompanyRepository;
import com.example.registration.repository.ConfirmationTokenRepository2;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository CompanyRepository;

    @Autowired
    ConfirmationTokenRepository2 confirmationTokenRepository2;

    @Autowired
    EmailService emailService;
    
    @Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public ResponseEntity<?> saveCompany(Company company) {

        if (CompanyRepository.existsByCompanyEmail(company.getCompanyEmail())) {
            return ResponseEntity.badRequest().body("Error: Email is already in use!");
        }
        
        company.setPassword(this.bCryptPasswordEncoder.encode(company.getPassword()));

        CompanyRepository.save(company);

        ConfirmationToken2 confirmationToken = new ConfirmationToken2(company);

        confirmationTokenRepository2.save(confirmationToken);

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(company.getCompanyEmail());
        mailMessage.setSubject("Complete Registration!");
        mailMessage.setText("To confirm your account, please click here : "
                +"http://localhost:8085/confirm-account?token="+confirmationToken.getConfirmationToken());
        emailService.sendEmail(mailMessage);

        System.out.println("Confirmation Token: " + confirmationToken.getConfirmationToken());

        return ResponseEntity.ok("Verify email by the link sent on your email address");
    }

    public ResponseEntity<?> confirmEmail(String confirmationToken) {
        ConfirmationToken2 token = confirmationTokenRepository2.findByConfirmationToken(confirmationToken);

        if(token != null)
        {
            Company Company = CompanyRepository.findByCompanyEmailIgnoreCase(token.getCompanyEntity().getCompanyEmail());
            Company.setEnabled(true);
            CompanyRepository.save(Company);
            return ResponseEntity.ok("Email verified successfully!");
        }
        return ResponseEntity.badRequest().body("Error: Couldn't verify email");
    }
}
