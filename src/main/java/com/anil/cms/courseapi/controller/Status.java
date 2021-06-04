package com.anil.cms.courseapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Status {

    @RequestMapping("/api-status")
    public String sayHi() {
        return "Good";
    }
    
}
