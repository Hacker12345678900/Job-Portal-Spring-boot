package com.example.registration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.registration.entity.JobPost;
import com.example.registration.entity.User;

@Repository
public interface JobPostRepository extends JpaRepository<JobPost, Integer>{

	 @Query(" from JobPost  where emailId = :emailId")
	 List<JobPost> findByEmail(@Param("emailId") String emailId);
	
	
}
