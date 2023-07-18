package com.example.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.entity.Contact;
import com.example.registration.repository.ContactRepository;

@Service
public class ContactDao {
	
	@Autowired
	ContactRepository contactRepository;
	
	public Contact registerContact(Contact contact) {
		return contactRepository.save(contact);
	}
	
	public List<Contact> getAllContact() {
		return contactRepository.findAll();
	}
	
	public Contact getContactById(int contactId) {
		return contactRepository.findById(contactId).orElse(null);
	}
	
	public Contact updateContact(Contact contact) {
		return contactRepository.save(contact);
	}
	
	public void deleteContact(int contactId) {
		contactRepository.deleteById(contactId);
	}
	
}
