package com.example.usersmanagementsystem.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;
//    @Autowired
//    private UsersController usersController;

//    @Test
//    public void contextLoads() throws Exception{
//        assertThat(usersController).isNotNull();
//    }
    @Test
    public void testGetAllUsers() throws Exception{
        this.mockMvc.perform(get("/getAllUsers"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Пользователи")));
    }

    @Test
    public void testNewUser() throws Exception{
        this.mockMvc.perform(get("/newUser"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Введите данные пользователя")));
    }

    @Test
    public void testGetUser() throws Exception{
        this.mockMvc.perform(get("/getUser72"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Введите данные пользователя")));
    }
}
