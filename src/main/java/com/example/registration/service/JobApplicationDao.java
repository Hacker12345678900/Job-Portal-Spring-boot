package com.example.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.entity.JobApplication;
import com.example.registration.entity.User;
import com.example.registration.repository.JobApplicationRepository;

@Service
public class JobApplicationDao {
	
	@Autowired
	JobApplicationRepository jobApplicationRepository;
	
	public JobApplication registerJobApplication(JobApplication jobApplication) {
		return jobApplicationRepository.save(jobApplication);
	}
	
	
	
	public JobApplication updateJobApplication(JobApplication jobApplication) {
		return jobApplicationRepository.save(jobApplication);
	}
	
	public void deleteJobApplication(int applicationId) {
		jobApplicationRepository.deleteById(applicationId);
	}
	public List<JobApplication> getDepartmentByName(String email) {
		return jobApplicationRepository.findByEmail(email);
	}
	
	
	
	
	
	
	
	
	public List<JobApplication> getAllJobApplication() {
		return jobApplicationRepository.findAll();
	}
	
	public JobApplication getJobApplicationById(int applicationId) {
		return jobApplicationRepository.findById(applicationId).orElse(null);
	}
}
