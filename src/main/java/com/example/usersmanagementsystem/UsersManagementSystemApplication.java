package com.example.usersmanagementsystem;

import com.example.usersmanagementsystem.entity.User;
import com.example.usersmanagementsystem.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class UsersManagementSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(UsersManagementSystemApplication.class, args);
    }
}
