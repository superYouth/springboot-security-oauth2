package com.wistron.serviceprovider1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Value("${spring.application.name}")
    private String name;

    public void printName(){
        System.out.println("name:"+name);
    }

}
