package com.trovix.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class SimpleController {

//    @Lazy
    @Autowired
SimpleService simpleService;

    @GetMapping
    public String hello() {
        return simpleService.hello();
    }
}
