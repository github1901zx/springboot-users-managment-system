package com.example.usersmanagementsystem;

import com.example.usersmanagementsystem.controllers.UsersController;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
class UsersManagementSystemApplicationTests {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private UsersController controller;

    @Test
    void contextLoads()throws Exception {
        assertThat(controller).isNotNull();
    }

    void test()throws Exception {
        assertThat(controller).isNotNull();
    }


}
