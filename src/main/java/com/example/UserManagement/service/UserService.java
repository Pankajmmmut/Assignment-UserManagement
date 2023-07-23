package com.example.UserManagement.service;

import com.example.UserManagement.model.User;
import com.example.UserManagement.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getUsers(){
        return userRepo.getUserList();
    }


    public String addUsers(List<User> users) {
        return userRepo.addUser(users);
    }

    public List<User> getUsersById(Integer userId) {
        List<User> requiredUser = new ArrayList<>();
        List<User> userList = getUsers();
        for(User user : userList){
            if(user.getUserId()==userId){
                requiredUser.add(user);
            }
        }
        return requiredUser;
    }
}
