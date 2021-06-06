package io.github.mac9p.dependencyinjection.services;


import io.github.mac9p.dependencyinjection.repositories.EnglishGreetingRepo;

public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hello world- English";
    }
}
