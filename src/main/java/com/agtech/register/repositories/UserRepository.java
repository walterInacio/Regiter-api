package com.agtech.register.repositories;

import com.agtech.register.documents.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    List<User> findAll();
}
