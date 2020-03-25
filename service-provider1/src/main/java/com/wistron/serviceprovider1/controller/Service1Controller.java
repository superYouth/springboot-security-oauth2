package com.wistron.serviceprovider1.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Service1Controller {

    @RequestMapping("/name")
    public String getName(){

        return "Parker";
    }

    @RequestMapping("/r1")
    @PreAuthorize("hasAnyAuthority('guest')")
    public  String getR1(){
        return "访问资源1";
    }

}
