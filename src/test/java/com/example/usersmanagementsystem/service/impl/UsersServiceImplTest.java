package com.example.usersmanagementsystem.service.impl;

import com.example.usersmanagementsystem.entity.User;
import com.example.usersmanagementsystem.repository.UsersRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootTest
class UsersServiceImplTest {
//    @Autowired
//    private UsersServiceImpl usersService;
    @Mock
    private PasswordEncoder passwordEncoder;
    @Mock
    private UsersRepository usersRepository;

    @Test
    void getAllUsers() {
        List<User> users = new ArrayList<>();
        Mockito.when(usersRepository.findAll()).thenReturn(users);
//        Mockito.verify(usersService, Mockito.times(1)).getAllUsers();
//        Assertions.assertNotNull(usersService.getAllUsers());
    }

    @Test
    void saveUser() {
        User user = new User();
        user.setPassword("123456");
        Mockito.when(passwordEncoder.encode(user.getPassword())).thenReturn(user.getPassword());
        Mockito.when(usersRepository.save(user)).thenReturn(user);
//        Assertions.assertNotNull(user.getPassword());
//        Assertions.assertNotNull(usersService.saveUser(user));
    }

    @Test
    void getUserById() {
        User user = new User("Vasa ","Ring123","asdfgD1","vasilyi@gmail.com", LocalDate.now());
        user.setId(1);
        Mockito.when(usersRepository.findById(user.getId())).thenReturn(Optional.empty());
//        Mockito.verify(usersRepository, Mockito.times(0)).findById(user.getId());
//        Assertions.assertNotNull(usersService.getUserById(user.getId()));
    }

    @Test
    void updateUser() {
        User user = new User("Vasa ","Ring123","asdfgD1","vasilyi@gmail.com", LocalDate.now());
        user.setId(1);
        Mockito.when(usersRepository.getById(user.getId())).thenReturn(user);
        Mockito.when(passwordEncoder.encode(user.getPassword())).thenReturn(user.getPassword());
        Mockito.when(usersRepository.save(user)).thenReturn(user);

//        Mockito.doNothing().when(user).setId(user.getId());
//        Mockito.doNothing().when(user).setName(user.getName());
//        Mockito.doNothing().when(user).setLogin(user.getLogin());
//        Mockito.doNothing().when(user).setPassword(user.getPassword());
//        Mockito.doNothing().when(user).setEmail(user.getEmail());
//        Mockito.doNothing().when(user).setDateBDay(user.getDateBDay());

//        Mockito.verify(usersRepository,Mockito.times(0)).getById(user.getId());
//        Mockito.verify(user ,Mockito.times(0)).setDateBDay(user.getDateBDay());
//        Mockito.verify(user,Mockito.times(0)).setName(user.getName());
//        Mockito.verify(user,Mockito.times(0)).setLogin(user.getLogin());
//        Mockito.verify(passwordEncoder, Mockito.times(0)).encode(user.getPassword());
//        Mockito.verify(user,Mockito.times(0)).setPassword(user.getPassword());
//        Mockito.verify(user,Mockito.times(0)).setEmail(user.getEmail());
//        Mockito.verify(usersRepository,Mockito.times(0)).save(user);
    }

    @Test
    void deleteUser() {
        User user = new User("Vasa ","Ring123","asdfgD1","vasilyi@gmail.com", LocalDate.now());
        user.setId(1);
        Mockito.doNothing().when(usersRepository).deleteById(user.getId());

//        Mockito.verify(usersRepository,Mockito.times(0)).deleteById(user.getId());
    }
}