package com.wistron.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class AuthController {

    @GetMapping("/mylogin")
    public String login(String username,String password) {

        return "my-login";
    }

    @GetMapping("/userlogin")
    public String login1(String username,String password) {

        return "hello";
    }




}
