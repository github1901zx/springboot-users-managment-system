package com.example.usersmanagementsystem.service.impl;

import com.example.usersmanagementsystem.entity.User;
import com.example.usersmanagementsystem.repository.UsersRepository;
import com.example.usersmanagementsystem.service.UsersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
     private UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
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
        updateUser.setPassword(user.getPassword());
        updateUser.setEmail(user.getEmail());
        return usersRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
         usersRepository.deleteById(id);
    }

}
