package com.contact.Service;

import com.contact.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactOfUsers(Long userId);
}
