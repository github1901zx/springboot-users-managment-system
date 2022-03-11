package com.example.usersmanagementsystem.service;

import com.example.usersmanagementsystem.entity.User;

import java.util.List;

public interface UsersService {
     List<User> getAllUsers();
     User saveUser(User employee);
     User getUserById(Integer id);
     User updateUser(User user);
     void deleteUser(Integer id);
}
