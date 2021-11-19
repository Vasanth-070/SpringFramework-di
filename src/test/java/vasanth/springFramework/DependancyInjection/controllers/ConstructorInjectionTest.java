package vasanth.springFramework.DependancyInjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vasanth.springFramework.DependancyInjection.Services.ConstructorServicesImpl;

class ConstructorInjectionTest {
    ConstructorInjection controller;
    @BeforeEach
    void setUp() {
        controller=new ConstructorInjection(new ConstructorServicesImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}