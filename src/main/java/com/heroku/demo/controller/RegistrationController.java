package com.heroku.demo.controller;

import com.heroku.demo.entity.User;
import com.heroku.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class RegistrationController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/registration")
    public String openRegistrPage(){
        return "registration";
    }

    @GetMapping("/registration")
    public String addUser(@RequestParam String login, @RequestParam String password, Map<String, Object> model){
        return "home";
    }
}
