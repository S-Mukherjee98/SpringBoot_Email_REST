package com.boot.email_rest.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.email_rest.entities.Email;

public interface EmailRepository extends CrudRepository<Email,Integer> {
    
    public Email findById(int id);
}
