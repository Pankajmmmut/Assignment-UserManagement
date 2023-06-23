package com.example.UserManagement.repository;

import com.example.UserManagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {

    List<User> users=new ArrayList<>();

    public List<User> getUserList() {
        return users;
    }

    public String addUser(List<User> users) {
        for(User user:users){
            this.users.add(user);
        }
        return "Given users are added";
    }
}
