package com.wistron.serviceprovider1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Service1Controller {

    @RequestMapping("/name")
    public String getName(){

        return "Parker";
    }

}
