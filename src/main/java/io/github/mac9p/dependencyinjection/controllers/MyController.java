package io.github.mac9p.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("hello");
        return "Hi";
    }
}
