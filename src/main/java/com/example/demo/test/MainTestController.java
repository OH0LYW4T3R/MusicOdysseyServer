package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainTestController {
    @GetMapping("/")
    public String mainTest() {
        return "main/index.html";
    }
}
