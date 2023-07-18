package com.example.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}

