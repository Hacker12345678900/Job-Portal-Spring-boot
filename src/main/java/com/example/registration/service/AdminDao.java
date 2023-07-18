package com.example.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.entity.Admin;
import com.example.registration.repository.AdminRepository;

@Service
public class AdminDao {
	
	@Autowired
	AdminRepository adminRepository;
	
	public Admin registerAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	
	public List<Admin> getAllAdmin() {
		return adminRepository.findAll();
	}
	
	public Admin getAdminById(int adminId) {
		return adminRepository.findById(adminId).orElse(null);
	}
	
	public Admin updateAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	
	public void deleteAdmin(int adminId) {
		adminRepository.deleteById(adminId);
	}
	
}
