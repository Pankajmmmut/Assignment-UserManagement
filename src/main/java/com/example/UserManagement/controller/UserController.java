package com.example.UserManagement.controller;

import com.example.UserManagement.model.User;
import com.example.UserManagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {
    @Autowired
    UserService userService;

    //adduser
    @PostMapping("users")
    public String addUser(@Valid @RequestBody List<User> users){
        return userService.addUsers(users);
    }

    //getUser.{userId}
    @RequestMapping("/users/{userId}")
    public List<User> getUsersById(@PathVariable Integer userId){
        return userService.getUsersById(userId);
    }

    //getAllUser
    @GetMapping("users")
        public List<User> getAllUsers(){
            return userService.getUsers();
        }

    //UpdateUserInfo


    //deleteUser
}
