package com.agtech.register.services;
import com.agtech.register.documents.User;
import com.agtech.register.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User create(User user){
        return userRepository.save(user);
    }

    public User update(User user){
        return userRepository.save(user);
    }

    public void delete(Integer id){
        userRepository.deleteById(id);
    }

    public List<User> finddAllUsers(){
        return userRepository.findAll();
    }
}

