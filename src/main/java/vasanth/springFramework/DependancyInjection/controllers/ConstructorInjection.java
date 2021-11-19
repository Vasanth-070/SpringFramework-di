package vasanth.springFramework.DependancyInjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vasanth.springFramework.DependancyInjection.Services.Services;
@Controller
public class ConstructorInjection {
    private final Services services;

    public ConstructorInjection(@Qualifier("constructorServicesImpl") Services services) {
        this.services = services;
    }
    public String getGreeting(){
        return services.sayGreeting();
    }
}
