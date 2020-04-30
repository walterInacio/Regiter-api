package com.agtech.register.controllers;

import com.agtech.register.documents.User;
import com.agtech.register.repositories.UserRepository;
import com.agtech.register.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public User create(@RequestBody User user){
        return userService.create(user);
    }
}
