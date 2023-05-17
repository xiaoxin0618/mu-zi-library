package com.muzi.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testMethod")
public class TestController {

    @GetMapping("helloWorld")
    public String sendHelloMessage(){
        return "hello world!";
    }
}
