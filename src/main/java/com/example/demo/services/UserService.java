/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.model.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author cyril
 */
@Service
public class UserService {
    private final List<User> users = new ArrayList();
    
    public boolean addUser(User user) {
        if(userExist(user.login, user.password)) {
            return false;
        }
        return users.add(user);
    }
    
    public boolean userExist(String login, String password) {
        return users.stream().anyMatch(u -> u.login.equals(login) && u.password.equals(password));
    }
    
}
