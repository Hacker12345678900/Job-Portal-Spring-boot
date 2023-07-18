package com.example.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.entity.Admin;
import com.example.registration.service.AdminDao;

@RestController
public class AdminController {

	@Autowired
	AdminDao adminDao;
	
	@PostMapping("/registerAdmin")
	public String registerAdmin(@RequestBody Admin admin) {
		adminDao.registerAdmin(admin);
		return "Admin Registered Successfully";
	}
	
	@RequestMapping("/getAllAdmins")
	public List<Admin> getAllAdmins() {
		return adminDao.getAllAdmin();
	}
	
	@GetMapping("/getAdminById/{AdminId}")
	public Admin getAdminById(@PathVariable("AdminId") int adminId) {
		Admin adminn = adminDao.getAdminById(adminId);
		
		if (adminn != null)
			return adminn;
		
		return new Admin( "Admin Not Found!!!");
	}
	  
	@PutMapping("/updateAdmin")
	public String updateAdmin(@RequestBody Admin admin) {
		adminDao.updateAdmin(admin);
		return "Admin Updated Successfully";
	}
	
	@DeleteMapping("/deleteAdmin/{AdminId}")
	public String deleteAdmin(@PathVariable("AdminId") int adminId) {
		adminDao.deleteAdmin(adminId);
		return "Admin " + adminId + " Deleted Successfully!!!";
	}
	
}
