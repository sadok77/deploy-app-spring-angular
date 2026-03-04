package com.oauth.demo.controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.oauth.demo.entities.User;
import com.oauth.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://localhost:4200/", "http://127.0.0.1:4200"})
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value="/all")
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @PostMapping(value="/add")
    public User addUser(@RequestBody User user) {
        return this.userService.addUser(user.getFirstName(),user.getLastName());
    }

    @DeleteMapping(value="/delete/{id}")
    public boolean deleteUser(@PathVariable Long id) {
        this.userService.deleteUser(id);
        return true;
    }
}
