package com.example.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.entity.JobApplication;
import com.example.registration.entity.User;
import com.example.registration.service.JobApplicationDao;

@RestController

public class JobApplicationController {

	
	@Autowired
	private JobApplicationDao JobApplicationDAO;
	
	
	@PostMapping("/registerJobApplication")
	public String registerApplication(@RequestBody JobApplication jobApplication) {
		JobApplicationDAO.registerJobApplication(jobApplication);
		return "User Registered Successfully";
	}
	
	
	
	
	
	@RequestMapping("/getAllJobApplications")
	public List<JobApplication> getAllJobApplications() {
		return JobApplicationDAO.getAllJobApplication();
	}
	
	@GetMapping("/getJobApplicationById/{applicationId}")
	public JobApplication getJobApplicationById(@PathVariable("applicationId") int applicationId) {
		JobApplication application = JobApplicationDAO.getJobApplicationById(applicationId);
		
		if (application != null)
			return application;
		
		return new JobApplication( "JobApplication Not Found!!!");
	}
		
	@PutMapping("/updateJobApplication")
	public String updateJobApplication(@RequestBody JobApplication application) {
		JobApplicationDAO.updateJobApplication(application);
		return "JobApplication Updated Successfully";
	}
	
	@DeleteMapping("/deleteJobApplication/{applicationId}")
	public String deleteJobApplication(@PathVariable("applicationId") int applicationId) {
		JobApplicationDAO.deleteJobApplication(applicationId);
		return "JobApplication " + applicationId + " Deleted Successfully!!!";
	}
	@GetMapping("/getDepartmentByemail/{email}")
	public List<JobApplication> getDepartmentByName(@PathVariable("email") String email) {
	return  JobApplicationDAO.getDepartmentByName(email);
		
	}
}
