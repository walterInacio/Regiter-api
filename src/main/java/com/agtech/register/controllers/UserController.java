package com.agtech.register.controllers;

import com.agtech.register.documents.User;
import com.agtech.register.repositories.UserRepository;
import com.agtech.register.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


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

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(@RequestParam(name = "id") Integer id){
        userService.delete(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> all(){
        return userService.finddAllUsers();
    }
}

