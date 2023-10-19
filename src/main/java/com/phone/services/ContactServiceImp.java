package com.phone.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phone.entity.Contact;
import com.phone.exception.ContactNotFoundException;
import com.phone.repository.Repository;
import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class ContactServiceImp implements ContactService {

	@Autowired
	Repository repository;

	@Override
	public Contact Add(Contact contact) {
		return repository.save(contact);
	}

	
	
	@Override
	public void DeleteContact(int id) {
		Optional<Contact> contact = repository.findById(id);
		if(contact.isPresent())
		{
			repository.delete(contact.get());
			
		}
		else
			throw new ContactNotFoundException("sorry");
		
	
		
	}

}
