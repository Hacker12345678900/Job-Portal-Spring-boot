package com.example.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
