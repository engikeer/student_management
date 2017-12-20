package com.hand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

//    测试函数
    @RequestMapping(value = "/admin")
    @ResponseBody
    public String testSpring() {
        return "My testSpring";
    }
}