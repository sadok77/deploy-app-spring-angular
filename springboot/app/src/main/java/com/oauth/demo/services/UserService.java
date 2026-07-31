package com.oauth.demo.services;

import com.oauth.demo.entities.User;
import com.oauth.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    public User addUser(String username, String password, String firstname, String lastname, String role){
       return this.userRepository.save(new User(
               username,
               passwordEncoder.encode(password),
               firstname,
               lastname,
               role == null || role.isBlank() ? "ROLE_USER" : role
       ));
    }

    public void deleteUser(Long id){
        this.userRepository.deleteById(id);
    }

    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }
}
