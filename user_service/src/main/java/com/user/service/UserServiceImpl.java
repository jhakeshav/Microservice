package com.user.service;

import com.user.entity.user;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.MediaSize;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    //fakeuserlists
    List<user> list= List.of(
            new user(1311L,"keshav","666666"),
            new user(1312L,"Prateek","555555"),
            new user(1313L,"Pankaj","12345")
    );

    @Override
    public user getUser(Long id) {
        return list.stream().filter(user -> user.getUserid().equals(id)).findAny().orElse(null);
    }
}
