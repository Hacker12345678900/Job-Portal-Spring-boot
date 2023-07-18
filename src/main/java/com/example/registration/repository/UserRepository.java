package com.example.registration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.registration.entity.JobApplication;
import com.example.registration.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	 @Query(" from JobApplication  where emailId = :emailId")
	 List<User> findByEmail(@Param("emailId") String userEmail);

	
    User findByUserEmailIgnoreCase(String emailId);

    Boolean existsByUserEmail(String email);
    
   
}
