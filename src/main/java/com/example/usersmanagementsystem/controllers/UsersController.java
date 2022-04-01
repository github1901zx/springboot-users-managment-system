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

    @GetMapping("/getAllUsers")
    public String listUsers(Model model){
        model.addAttribute("users",usersService.getAllUsers());
        return "users";
    }

    @GetMapping("/newUser")
    public String createUserForm(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "create_user";
    }
    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user){
        usersService.saveUser(user);
       return "redirect:/getAllUsers";
    }
    @GetMapping("/getUser{id}")
    public String getUser(@PathVariable Integer id,Model model){
        model.addAttribute("user",usersService.getUserById(id));
        return "action_user" ;
    }
    @PostMapping ("/userUpdate{id}")
    public  String updateUser(@ModelAttribute("user") User user){
        usersService.updateUser(user);
        return "redirect:/getAllUsers";
    }

    @GetMapping("/userDelete{id}")
    public String deleteUser(@PathVariable Integer id){
        usersService.deleteUser(id);
        return "redirect:/getAllUsers";
    }

}
