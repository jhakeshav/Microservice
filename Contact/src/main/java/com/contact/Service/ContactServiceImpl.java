package com.contact.Service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //Fakelistsofcontacts
    List<Contact> list= List.of(
            new Contact(1L,1311L,"Amit.j@glocalmind.com","Amit"),
            new Contact(2L,1311L,"sohan.j@glocalmind.com","sohan"),
            new Contact(3L,1313L,"sujit.j@glocalmind.com","Sujit"),
            new Contact(4L,1314L,"samir.j@glocalmind.com","Samir")


    );


    @Override
    public List<Contact> getContactOfUsers(Long userId) {
        return list.stream().filter(Contact-> Contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
