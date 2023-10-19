package com.phone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phone.entity.Contact;
import com.phone.exception.ContactNotFoundException;
import com.phone.repository.Repository;
import com.phone.services.ContactService;
@RestController
public class Controller {

	@Autowired
	ContactService contactService;
	
	@PostMapping("Add")
	Contact AddContact(@RequestBody Contact contact)
	{
		
		return contactService.Add(contact);
	}
	
	@DeleteMapping("delete/{id}")
	String  Delete(@PathVariable int id)
	{
		contactService.DeleteContact(id);
		return "Deleted";
	}
	
}
