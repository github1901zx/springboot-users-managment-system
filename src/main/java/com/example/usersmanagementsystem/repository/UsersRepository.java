package com.example.usersmanagementsystem.repository;

import com.example.usersmanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User,Integer> {
}
