package com.example.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.entity.JobApplication;
import com.example.registration.entity.JobPost;
import com.example.registration.repository.JobPostRepository;

@Service
public class JobPostDao {
	
	@Autowired
	JobPostRepository JobPostRepository;
	
	public JobPost registerJobPost(JobPost jobPost) {
		return JobPostRepository.save(jobPost);
	}
	
	public List<JobPost> getAllJobPost() {
		return JobPostRepository.findAll();
	}
	
	public JobPost getJobPostById(int jobPostId) {
		return JobPostRepository.findById(jobPostId).orElse(null);
	}

	public JobPost updateJobPost(JobPost jobPost) {
		return JobPostRepository.save(jobPost);
	}
	
	public void deleteJobPost(int jobPostId) {
		JobPostRepository.deleteById(jobPostId);
	}
	public List<JobPost> getDepartmentByName(String email) {
		return JobPostRepository.findByEmail(email);
	}
}
