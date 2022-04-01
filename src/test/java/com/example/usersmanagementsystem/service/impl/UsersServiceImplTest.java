package com.example.usersmanagementsystem.service.impl;

import com.example.usersmanagementsystem.entity.User;
import com.example.usersmanagementsystem.repository.UsersRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;


@SpringBootTest
class UsersServiceImplTest {
    @Autowired
    private UsersServiceImpl usersService;
    @Mock
    private PasswordEncoder passwordEncoder;
    @Mock
    private UsersRepository usersRepository;

    @Test
    void getAllUsers() {
        Mockito.verify(usersRepository, Mockito.times(0)).findAll();
        Assertions.assertNotNull(usersService.getAllUsers());
    }

    @Test
    void saveUser() {
        User user = new User();
        user.setPassword("123456");
        Mockito.verify(passwordEncoder, Mockito.times(0)).encode(user.getPassword());
        Assertions.assertNotNull(user.getPassword());
        Assertions.assertNotNull(usersService.saveUser(user));
    }

    @Test
    void getUserById() {
        User user = new User("Vasa ","Ring123","asdfgD1","vasilyi@gmail.com", LocalDate.now());
        user.setId(1);
        Mockito.verify(usersRepository, Mockito.times(0)).findById(user.getId());
        Assertions.assertNotNull(usersService.getUserById(user.getId()));
    }

    @Test
    void updateUser() {
        User user = new User("Vasa ","Ring123","asdfgD1","vasilyi@gmail.com", LocalDate.now());
        user.setId(1);
        Mockito.verify(usersRepository,Mockito.times(0)).getById(user.getId());
//        Mockito.verify(user ,Mockito.times(0)).setDateBDay(user.getDateBDay());
//        Mockito.verify(user,Mockito.times(0)).setName(user.getName());
//        Mockito.verify(user,Mockito.times(0)).setLogin(user.getLogin());
        Mockito.verify(passwordEncoder, Mockito.times(0)).encode(user.getPassword());
//        Mockito.verify(user,Mockito.times(0)).setPassword(user.getPassword());
//        Mockito.verify(user,Mockito.times(0)).setEmail(user.getEmail());
        Mockito.verify(usersRepository,Mockito.times(0)).save(user);
    }

    @Test
    void deleteUser() {
        User user = new User("Vasa ","Ring123","asdfgD1","vasilyi@gmail.com", LocalDate.now());
        Mockito.verify(usersRepository,Mockito.times(0)).deleteById(user.getId());
    }
}