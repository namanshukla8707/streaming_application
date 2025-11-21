package com.code.free.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    
    @GetMapping("/info")
    public String getUserInfo(){
        return "User Info";
    }

}
