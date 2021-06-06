package io.github.mac9p.dependencyinjection.services;


import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating singleton");
    }

    public String getMyScope(){
        return "I'm a singleton";
    }
}
