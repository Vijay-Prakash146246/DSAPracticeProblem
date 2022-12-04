package com.vijay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mainController
{
    @RequestMapping("/")
    public  String home()
    {
        System.out.println("This is my Home page");
        return  "Home";
    }
    @RequestMapping("/contact")
    public  String contact()
    {
        return "Contact";
    }
}
