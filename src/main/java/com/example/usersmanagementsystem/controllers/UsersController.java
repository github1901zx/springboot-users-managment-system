package com.example.usersmanagementsystem.controllers;

import com.example.usersmanagementsystem.entity.User;
import com.example.usersmanagementsystem.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsersController {

    private UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/users")
    public String listUsers(Model model){
        model.addAttribute("users",usersService.getAllUsers());
        return "users";
    }

    @GetMapping("/users/new")
    public String createUserForm(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "create_user";
    }
    @PostMapping("/users")
    public String saveUser(@ModelAttribute("user") User user){
        usersService.saveUser(user);
       return "redirect:/users";
    }
    @GetMapping("/user/get/{id}")
    public String getUser(@PathVariable Integer id,Model model){
        model.addAttribute("user",usersService.getUserById(id));
        return "action_user" ;
    }
    @PostMapping ("/user/update/{id}")
    public  String updateUser(@ModelAttribute("user") User user){
        usersService.updateUser(user);
        return "redirect:/users";
    }

    @GetMapping("/user/{id}")
    public String deleteUser(@PathVariable Integer id){
        usersService.deleteUser(id);
        return "redirect:/users";
    }

}
