package com.example.registration.controller;

import com.example.registration.entity.User;
import com.example.registration.service.UserDao;
import com.example.registration.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserDao userDao;
    
    @Autowired
    private UserService userService;

    @PostMapping("/registerUser")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @RequestMapping(value="/confirm-account", method= {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<?> confirmUserAccount(@RequestParam("token")String confirmationToken) {
        return userService.confirmEmail(confirmationToken);
    }
    
	@RequestMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return userDao.getAllUser();
	}
	
	  
	@PutMapping("/updateUser")
	public String updateUser(@RequestBody User user) {
		userDao.updateUser(user);
		return "User Updated Successfully";
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public String deleteUser(@PathVariable("userId") int userId) {
		userDao.deleteUser(userId);
		return "User " + userId + " Deleted Successfully!!!";
	}
	
}
