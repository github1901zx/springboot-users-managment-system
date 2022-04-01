package com.example.usersmanagementsystem;

import com.example.usersmanagementsystem.controllers.UsersController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UsersManagementSystemApplicationTests {

    @Autowired
    UsersController controller;

    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }

}
