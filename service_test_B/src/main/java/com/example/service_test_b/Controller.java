package com.example.service_test_b;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class Controller {
    @GetMapping("/say")
    public String hello(){
        return "Hello_Service_B";
    }
}
