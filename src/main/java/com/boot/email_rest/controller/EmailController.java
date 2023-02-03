package com.boot.email_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.email_rest.entities.Email;
import com.boot.email_rest.services.EmailServices;

@RestController
public class EmailController {
    
    @Autowired
    private EmailServices emailServices;

    @GetMapping("/email")
    public List<Email> getEmail(){
        
        List<Email> e= this.emailServices.getAllEmail();
        return e;
    }

    @GetMapping("/email/{id}")
    public Email getEmailById(@PathVariable("id") int id){
        Email e=this.emailServices.getEmailById(id);
        return e ; 
    }

    @PostMapping("/email")
    public Email addEmail(@RequestBody Email e){
        Email email=null;
        email=this.emailServices.addEmail(e);
        return email;
    }

    @PutMapping("/email/{id}")
    public Email updateEmail(@RequestBody Email email, @PathVariable("id") int eid ){
        
        Email e=this.emailServices.updatEmail(email, eid);
        return e;
    }

    @DeleteMapping("/email/{id}")
    public void deleteEmail(@PathVariable("id") int id ){
        this.emailServices.deleteEmail(id);
    }
}
