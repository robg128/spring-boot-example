package com.trovix.example;

import org.springframework.stereotype.Service;

//@Lazy
@Service
public class SimpleService {

    public SimpleService() {
        System.out.println("Lazy Service:: Constructor loaded");
    }

    public String hello() {
        return "Hello Monster!!!";
    }
}
