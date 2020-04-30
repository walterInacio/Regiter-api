package com.agtech.register.services;

import com.agtech.register.documents.User;
import com.agtech.register.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User create(User user){
        return userRepository.save(user);
    }
}
