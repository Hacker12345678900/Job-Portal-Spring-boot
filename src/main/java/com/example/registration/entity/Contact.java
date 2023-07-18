package com.example.registration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contactUs")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contactId")
	private int contactId;
	
	@Column(name = "clientName")
	private String clientName;
	
	@Column(name = "emailId")
	private String emailId;
	
	@Column(name = "issueSubject")
	private String issueSubject;
	
	@Column(name = "message")
	private String message;

		
	//DC
	public Contact() {
		
	}
	
	//PC
	public Contact(int contactId, String clientName, String emailId, String issueSubject, String message) {
		super();
		this.contactId = contactId;
		this.clientName = clientName;
		this.emailId = emailId;
		this.issueSubject = issueSubject;
		this.message = message;
	}
	
	public Contact(String string) {
		//for controller
	}
	
	
	// G & S

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getIssueSubject() {
		return issueSubject;
	}

	public void setIssueSubject(String issueSubject) {
		this.issueSubject = issueSubject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}