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

import com.example.registration.entity.Contact;
import com.example.registration.service.ContactDao;

@RestController
public class ContactController {

	
	@Autowired
	ContactDao contactDao;

	
	@PostMapping("/registerContact")
	public String registerContact(@RequestBody Contact contact) {
		contactDao.registerContact(contact);
		return "Contact Registered Successfully";
	}
	
	
	@RequestMapping("/getAllContacts")
	public List<Contact> getAllContacts() {
		return contactDao.getAllContact();
	}
	
	@GetMapping("/getContactById/{contactId}")
	public Contact getContactById(@PathVariable("contactId") int contactId) {
		Contact contact = contactDao.getContactById(contactId);
		
		if (contact != null)
			return contact;
		
		return new Contact( "Contact Not Found!!!");
	}
	  
	@PutMapping("/updateContact")
	public String updateContact(@RequestBody Contact contact) {
		contactDao.updateContact(contact);
		return "Contact Updated Successfully";
	}
	
	@DeleteMapping("/deleteContact/{contactId}")
	public String deleteContact(@PathVariable("contactId") int contactId) {
		contactDao.deleteContact(contactId);
		return "Contact " + contactId + " Deleted Successfully!!!";
	}
	
}
