package io.github.mac9p.dependencyinjection.services;

import org.springframework.stereotype.Service;

public class PropertyGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hello world - property";
    }
}
