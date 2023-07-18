package com.example.registration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobapplication")

public class JobApplication{
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "applicationId")
		private int applicationId;

		@Column(name = "userName")
		private String userName;
		
		@Column(name = "emailId")
		private String emailId;
				
		@Column(name = "contactNum")
		private long contactNum;
		
		@Column(name = "gender")
		private String gender;	

		@Column(name = "skills")		// Key Skills like Java, Python,etc.....
		private String skills;

		@Column(name = "locationName")	// Location API(place of residence of user)
		private String locationName;
		
		@Column(name = "educational_details")	// Highest graduation
		private String educational_details;	
		
		@Column(name = "cgpaScored")	// Highest graduation : Percentage or CGPA
		private String cgpaScored;	

		@Column(name = "passedYear")			//Highest graduation passed Year
		private String passedYear;
		
		@Column(name = "experience_details")  // Experienced / fresher ---0,1,2,3,4,........in dropdown
		private String experience_details;	
		
		@Column(name = "presentCtc")		// NA or salary of User in LPA
		private String presentCtc;
		
		@Column(name = "languages")		// english,telugu, etc... possible use API
		private String languages;
		
		@Column(name = "age_Major")		// Drop down Yes/No
		private String age_Major;
		
		
		
		
		//DC
		public JobApplication(){
			
		}

		// PC
		public JobApplication(int applicationId, String userName, String emailId, long contactNum, String gender,
				String skills, String locationName, String educational_details, String cgpaScored, String passedYear,
				String experience_details, String presentCtc, String languages, String age_Major) {
			super();
			this.applicationId = applicationId;
			this.userName = userName;
			this.emailId = emailId;
			this.contactNum = contactNum;
			this.gender = gender;
			this.skills = skills;
			this.locationName = locationName;
			this.educational_details = educational_details;
			this.cgpaScored = cgpaScored;
			this.passedYear = passedYear;
			this.experience_details = experience_details;
			this.presentCtc = presentCtc;
			this.languages = languages;
			this.age_Major = age_Major;
		}
		
		
		//Controller
		public JobApplication( String string) {
			
		}

		
		// G & S (POJO)
		public int getApplicationId() {
			return applicationId;
		}

		public void setApplicationId(int applicationId) {
			this.applicationId = applicationId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public long getContactNum() {
			return contactNum;
		}

		public void setContactNum(long contactNum) {
			this.contactNum = contactNum;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getSkills() {
			return skills;
		}

		public void setSkills(String skills) {
			this.skills = skills;
		}

		public String getLocationName() {
			return locationName;
		}

		public void setLocationName(String locationName) {
			this.locationName = locationName;
		}

		public String getEducational_details() {
			return educational_details;
		}

		public void setEducational_details(String educational_details) {
			this.educational_details = educational_details;
		}

		public String getCgpaScored() {
			return cgpaScored;
		}

		public void setCgpaScored(String cgpaScored) {
			this.cgpaScored = cgpaScored;
		}

		public String getPassedYear() {
			return passedYear;
		}

		public void setPassedYear(String passedYear) {
			this.passedYear = passedYear;
		}

		public String getExperience_details() {
			return experience_details;
		}

		public void setExperience_details(String experience_details) {
			this.experience_details = experience_details;
		}

		public String getPresentCtc() {
			return presentCtc;
		}

		public void setPresentCtc(String presentCtc) {
			this.presentCtc = presentCtc;
		}

		public String getLanguages() {
			return languages;
		}

		public void setLanguages(String languages) {
			this.languages = languages;
		}

		public String getAge_Major() {
			return age_Major;
		}

		public void setAge_Major(String age_Major) {
			this.age_Major = age_Major;
		}
		
		

		// Attribute for Resume---------------------------
		
//		@Lob
//		@Column(name = "resumeData")
//		private byte[] resumeData;
		
		
		//RELATIONS----------------------
		
		// ApplicationDetails many to one JobInformation
//	    @ManyToOne(cascade = CascadeType.ALL)
//	    @JoinColumn(name = "jobId")
//	    private JobPost jobId;
//	    
//		@OneToOne(cascade = CascadeType.ALL)
//	    @JoinColumn(name = "userId")
//	    private User userId;

		
}