package vasanth.springFramework.DependancyInjection.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import vasanth.springFramework.DependancyInjection.Services.Services;

@Controller
public class MyController {
    private final Services services;

    public MyController(Services services) {
        this.services = services;
    }
    public String sayHello(){
        return services.sayGreeting();
    }
}
