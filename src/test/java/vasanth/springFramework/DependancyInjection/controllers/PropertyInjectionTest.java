package vasanth.springFramework.DependancyInjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vasanth.springFramework.DependancyInjection.Services.ConstructorServicesImpl;

class PropertyInjectionTest {
    PropertyInjection controller;
    @BeforeEach
    void setUp() {
        controller = new PropertyInjection();
       controller.services = new ConstructorServicesImpl();
    }
    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}