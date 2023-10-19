package com.phone.services;

import java.util.Optional;

import com.phone.entity.Contact;


public interface ContactService {
		//adding contact to directory:
		public Contact Add(Contact contact);
		
		//Deleting contact from directory:
		public void DeleteContact(int id);
		
		//public List<Contact> 
}
