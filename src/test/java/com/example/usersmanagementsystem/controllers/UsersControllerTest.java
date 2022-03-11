package com.example.usersmanagementsystem.controllers;

import com.example.usersmanagementsystem.entity.User;
import com.example.usersmanagementsystem.repository.UsersRepository;
import com.example.usersmanagementsystem.service.UsersService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UsersControllerTest {
    @Autowired
    UsersService usersService;
    @Autowired
    UsersRepository usersRepository;

    @Test
    void listUsers() {
        List<User> allUsers = usersService.getAllUsers();
        Assertions.assertFalse(allUsers.isEmpty());
    }


}