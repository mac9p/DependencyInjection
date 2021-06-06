package io.github.mac9p.dependencyinjection.services;


public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Primary greeting from PRIMARY bean";
    }
}
