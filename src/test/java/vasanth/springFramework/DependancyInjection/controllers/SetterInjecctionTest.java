package vasanth.springFramework.DependancyInjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vasanth.springFramework.DependancyInjection.Services.ConstructorServicesImpl;

class SetterInjecctionTest {
    SetterInjecction setterInjecctionController;
    @BeforeEach
    void setUp() {
        setterInjecctionController = new SetterInjecction();
        setterInjecctionController.setServices(new ConstructorServicesImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjecctionController.getGreeting());
    }
}