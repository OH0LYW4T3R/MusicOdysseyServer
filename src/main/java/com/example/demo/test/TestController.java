package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping("/main")
    public String testMain() {
        return "test/test.html";
    }

//    @GetMapping("/")
//    public String test() {
//        return "main/index.html";
//    }
}
