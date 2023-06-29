package com.example.demo.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.UserDto;
import com.example.demo.services.UserService;

@Controller
public class AuthController {
	
	private UserService userService;

    // handler method to handle home page request
    @GetMapping("/index")
    public String home(){
        return "index";
    }
    
 // handler method to handle login request
    @GetMapping("/login")
    public String login(){
        return "login";
    }
 // handler method to handle list of users
    @GetMapping("/users")
    public String users(Model model){
        List<UserDto> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "users";
    }
}