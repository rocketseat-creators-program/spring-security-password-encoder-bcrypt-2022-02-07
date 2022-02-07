package com.rocketseat.experts.club.passwordencoderbcrypt.controller;

import com.rocketseat.experts.club.passwordencoderbcrypt.model.User;
import com.rocketseat.experts.club.passwordencoderbcrypt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return this.userService.createNewUser(user);
    }


    @GetMapping("/test-login")
    public String testUser(){
        return "logado";
    }
}
