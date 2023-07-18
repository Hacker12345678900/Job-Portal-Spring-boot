package com.example.registration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "companyId")
	private int companyId;
	
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "companyEmail")
	private String companyEmail;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "companyLocation")
	private String companyLocation;
	
	@Column(name = "contactNum")
	private long contactNum;
	
	private boolean isEnabled;
	
	
	
    // Default constructor
    public Company() {
		super();
	}

	// constructor with out relations
	public Company(int companyId, String userName, String companyEmail, String password, String companyName,
			String companyLocation, long contactNum, boolean isEnabled) {
		super();
		this.companyId = companyId;
		this.userName = userName;
		this.companyEmail = companyEmail;
		this.password = password;
		this.companyName = companyName;
		this.companyLocation = companyLocation;
		this.contactNum = contactNum;
		this.isEnabled = isEnabled;
	}

	public boolean isEnabled() {
		return isEnabled;
	}



	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	// verify in controller 
	public Company( String string) {
		
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}

	public long getContactNum() {
		return contactNum;
	}

	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}

	


	//S & G
	
}
