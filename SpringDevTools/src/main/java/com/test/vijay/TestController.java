package com.test.vijay;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/test") //if we are using this only then we have required to return the page
    //other wise just use the anotation @ResponseBody
    @ResponseBody
    public  String test()
    {
        int a = 99;
        int b = 89;
        int c = 12;
        return "This is just for testing \t sum of a and b :"+(a+b+c);
    }
}
