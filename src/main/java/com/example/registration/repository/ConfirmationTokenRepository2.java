package com.example.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.entity.ConfirmationToken2;

@Repository("confirmationTokenRepository2")
public interface ConfirmationTokenRepository2 extends JpaRepository<ConfirmationToken2, Long> {
    ConfirmationToken2 findByConfirmationToken(String confirmationToken);
    
}