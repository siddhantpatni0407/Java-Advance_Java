package com.sid.springboot.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    //@RequestMapping(value="/", method= RequestMethod.GET)
    //or
    @GetMapping("/")
    public String helloWorld()
    {
        return "Welcome to spring boot demo sid..!!!";
    }
}
