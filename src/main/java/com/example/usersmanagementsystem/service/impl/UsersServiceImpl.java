package com.example.usersmanagementsystem.service.impl;

import com.example.usersmanagementsystem.entity.User;
import com.example.usersmanagementsystem.repository.UsersRepository;
import com.example.usersmanagementsystem.service.UsersService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
     private UsersRepository usersRepository;
     private PasswordEncoder passwordEncoder;

    public UsersServiceImpl(UsersRepository usersRepository, PasswordEncoder passwordEncoder) {
        this.usersRepository = usersRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        String encodePassword = this.passwordEncoder.encode(user.getPassword());
        user.setPassword(encodePassword);
        return usersRepository.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return usersRepository.findById(id).get();
    }

    @Override
    public User updateUser(User user) {
        User updateUser = usersRepository.getById(user.getId());
        updateUser.setDateBDay(user.getDateBDay());
        updateUser.setName(user.getName());
        updateUser.setLogin(user.getLogin());
        String encodePassword = this.passwordEncoder.encode(user.getPassword());
        user.setPassword(encodePassword);
        updateUser.setPassword(user.getPassword());
        updateUser.setEmail(user.getEmail());
        return usersRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
         usersRepository.deleteById(id);
    }

}
