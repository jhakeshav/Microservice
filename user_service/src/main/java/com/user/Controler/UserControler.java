package com.user.Controler;

import com.user.entity.user;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControler {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public user getUser(@PathVariable("userId") Long userid)
    {
        user user=this.userService.getUser(userid);
        //http://localhost:9006/contact/user/1311

        List contacts = this.restTemplate.getForObject("http://contact-services/contact/user/"+ user.getUserid(), List.class);
        user.setContacts(contacts);
        return user;

    }

}
