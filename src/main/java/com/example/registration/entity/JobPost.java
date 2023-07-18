package com.example.registration.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JobPost")
public class JobPost {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "jobId")
	private int jobId;
	
	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "emailId")		// contact Email-ID of usere / company
	private String emailId;
	
	@Column(name = "jobTitle")			//Job ROle
	private String jobTitle;
	
	@Column(name = "categoryName")		// job Category																	
	private String categoryName;
	
	@Column(name = "experience_details")	//Fresher / 0,1,2,3,4,5,.......... Show in deop Down
	private String experience_details;
	
	@Column(name = "salaryRange")		// 3-8 lacs PA
	private String salaryRange;
	
	@Column(name = "jobLocation")		// If possible use location API
	private String jobLocation;	
	
	@Column(name = "noOfVacancies")
	private int noOfVacancies;
	
	@Column(name = "applicationDate")	// job posted date
	private Date applicationDate;
	
	@Column(name = "applicationDeadline")	// job dead line 
	private Date applicationDeadline;				
	
	@Column(name = "description")		// job description
	private String description ;
	
	@Column(name = "industryType")		//IT-services & Consulting ,marketing,etc....
	private String industryType;
	
	@Column(name = "department")		// production , HR , Admin, etc...
	private String department;
	
	@Column(name = "jobType")			//IN DROP DOWN WE NEED TO ASK FOR PART-TIME OR FULL TIME, ETC.. 
	private String jobType;
	
	@Column(name = "min_Educational_req")	// graduction / post graduaction or ubder graduaction
	private String min_Educational_req;
	
	@Column(name = "skillsRequired")		// key skills
	private String skillsRequired;
	



	// DC
	public JobPost() {
	
	}
	
	// PC
	public JobPost(int jobId, String companyName, String emailId, String jobTitle, String categoryName,
			String experience_details, String salaryRange, String jobLocation, int noOfVacancies, Date applicationDate,
			Date applicationDeadline, String description, String industryType, String department, String jobType,
			String min_Educational_req, String skillsRequired) {
		this.jobId = jobId;
		this.companyName = companyName;
		this.emailId = emailId;
		this.jobTitle = jobTitle;
		this.categoryName = categoryName;
		this.experience_details = experience_details;
		this.salaryRange = salaryRange;
		this.jobLocation = jobLocation;
		this.noOfVacancies = noOfVacancies;
		this.applicationDate = applicationDate;
		this.applicationDeadline = applicationDeadline;
		this.description = description;
		this.industryType = industryType;
		this.department = department;
		this.jobType = jobType;
		this.min_Educational_req = min_Educational_req;
		this.skillsRequired = skillsRequired;
	}

	
	// FOR CONTROLLER
	public JobPost(String string) {
		
	}
	
	
	// G &  S
	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getExperience_details() {
		return experience_details;
	}

	public void setExperience_details(String experience_details) {
		this.experience_details = experience_details;
	}

	public String getSalaryRange() {
		return salaryRange;
	}

	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public int getNoOfVacancies() {
		return noOfVacancies;
	}

	public void setNoOfVacancies(int noOfVacancies) {
		this.noOfVacancies = noOfVacancies;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public Date getApplicationDeadline() {
		return applicationDeadline;
	}

	public void setApplicationDeadline(Date applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIndustryType() {
		return industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getMin_Educational_req() {
		return min_Educational_req;
	}

	public void setMin_Educational_req(String min_Educational_req) {
		this.min_Educational_req = min_Educational_req;
	}

	public String getSkillsRequired() {
		return skillsRequired;
	}

	public void setSkillsRequired(String skillsRequired) {
		this.skillsRequired = skillsRequired;
	}

	

	
	
//	//RELATIONS---------------------
//	
//	//  jobInformation to company
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "companyId")
//	private Company companyId;

	

	
//	//  jobInformation to applicatinDetails
//	@OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "applicationDetails_Id", referencedColumnName = "jobId")
//    List < ApplicationDetails > applicationDetails = new ArrayList < > ();


	
}