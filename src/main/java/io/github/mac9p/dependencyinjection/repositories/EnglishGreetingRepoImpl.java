package io.github.mac9p.dependencyinjection.repositories;

public class EnglishGreetingRepoImpl implements EnglishGreetingRepo {
    @Override
    public String getGreeting() {
        return "hello world- English";
    }
}
