package com.contact.Controler;

import com.contact.Service.ContactService;
import com.contact.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactControler {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/user/{userId}")
    public List<Contact> getContact(@PathVariable("userId") Long userId)
    {
        return this.contactService.getContactOfUsers(userId);
    }
}
