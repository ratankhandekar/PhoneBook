package com.phone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phone.entity.Contact;

public interface Repository extends JpaRepository<Contact, Integer>{
	

}
