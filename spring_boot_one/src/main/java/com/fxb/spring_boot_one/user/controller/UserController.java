package com.fxb.spring_boot_one.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "hello spring boot";

    }
}