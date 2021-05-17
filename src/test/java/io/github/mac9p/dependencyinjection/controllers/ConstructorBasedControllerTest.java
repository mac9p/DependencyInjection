package io.github.mac9p.dependencyinjection.controllers;

import io.github.mac9p.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorBasedControllerTest {

    ConstructorBasedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorBasedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}