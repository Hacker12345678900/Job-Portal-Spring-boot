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

import com.example.registration.entity.JobApplication;
import com.example.registration.entity.JobPost;
import com.example.registration.service.JobPostDao;

@RestController
public class JobPostController {

	
	@Autowired
	JobPostDao JobPostDAO;
	
	@PostMapping("/registerJobPost")
	public String registerJobPost(@RequestBody JobPost job) {
		JobPostDAO.registerJobPost(job);
		return "JobPost Registered Successfully";
	}
	
	@RequestMapping("/getAllJobPosts")
	public List<JobPost> getAllJobPosts() {
		return JobPostDAO.getAllJobPost();
	}
	
	@GetMapping("/getJobPostById/{deptId}")
	public JobPost getJobPostById(@PathVariable("deptId") int jobId) {
		JobPost job = JobPostDAO.getJobPostById(jobId);
		
		if (job != null)
			return job;
		
		return new JobPost("JobPost Not Found!!!");
	}
	
	@PutMapping("/updateJobPost")
	public String updateJobPost(@RequestBody JobPost job) {
		JobPostDAO.updateJobPost(job);
		return "JobPost Updated Successfully";
	}
	
	@DeleteMapping("/deleteJobPost/{jobId}")
	public String deleteJobPost(@PathVariable("jobId") int jobId) {
		JobPostDAO.deleteJobPost(jobId);
		return "JobPost " + jobId + " Deleted Successfully!!!";
	}
	@GetMapping("/getByemail/{email}")
	public List<JobPost> getDepartmentByName(@PathVariable("email") String email) {
	return  JobPostDAO.getDepartmentByName(email);
		
	}
	
}
