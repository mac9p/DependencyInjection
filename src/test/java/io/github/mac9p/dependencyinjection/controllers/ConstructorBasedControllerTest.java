package io.github.mac9p.dependencyinjection.controllers;

import io.github.mac9p.dependencyinjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorBasedControllerTest {

    ConstructorBasedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorBasedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}