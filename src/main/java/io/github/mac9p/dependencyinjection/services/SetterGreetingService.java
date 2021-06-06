package io.github.mac9p.dependencyinjection.services;

import org.springframework.stereotype.Service;
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hello world - setter";
    }
}

