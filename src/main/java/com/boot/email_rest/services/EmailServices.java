package com.boot.email_rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boot.email_rest.dao.EmailRepository;
import com.boot.email_rest.entities.Email;

@Component
public class EmailServices {

    @Autowired
    private EmailRepository emailRepository;

    // Returns all The Email List And Its Details


    public List<Email> getAllEmail() {

        List<Email> list = (List<Email>) this.emailRepository.findAll(); 
        // returns a iterable thats why
        // type casting is needed to convert the iterable into list object

        return list;
    }
    //Get email by id
    public Email getEmailById(int id) {

        Email email = null;

        email = this.emailRepository.findById(id);
        return email;

    }

    //Adding the book 

    public Email addEmail(Email e){
        Email email;
        email=this.emailRepository.save(e);
        return email;
    }

    //Update The Email id

    public Email updatEmail(Email email, int eid){
        email.setId(eid);
        Email em=  this.emailRepository.save(email);
        return em;
    }

    //Delete Email Details by id

    public void deleteEmail(int id){
        this.emailRepository.deleteById(id);
    }
    
}
