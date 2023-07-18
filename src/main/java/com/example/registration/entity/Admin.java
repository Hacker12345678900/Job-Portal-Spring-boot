package com.example.registration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "adminId")
	private int adminId;
	
	@Column(name = "adminName")
	private String adminName;
	
	@Column(name = "emailId")
	private String emailId;
	
	@Column(name = "password")
	private String password;
	
    
    
    // default constructor
	public Admin() {
		
	}
	

	//PC
	public Admin(int adminId, String adminName, String emailId, String password) {
		
		this.adminId = adminId;
		this.adminName = adminName;
		this.emailId = emailId;
		this.password = password;
	}

	
	public Admin(String string) {
		// For Controller
	}


	//G & S
	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public String getAdminName() {
		return adminName;
	}


	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
// Relations--------
	
	
//	// admin to user 1-M
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "userId")
//    private List < User > User= new ArrayList < > ();
//    
//	// admin to COMPANY 1-M
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "companyId")
//    private List < Company > Company = new ArrayList < > ();
	
	

}
