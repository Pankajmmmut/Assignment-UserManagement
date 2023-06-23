package com.example.UserManagement.controller;

import com.example.UserManagement.model.User;
import com.example.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //adduser
    @PostMapping("users")
    public String addUser(@RequestBody List<User> users){
        return userService.addUsers(users);
    }

   // private List<User> getUserList() {
   // }

    //getUser.{userId}


    //getAllUser
    @GetMapping("users")
        public List<User> getUsers(){
            return userService.getUsers();
        }

    //UpdateUserInfo


    //deleteUser
}
