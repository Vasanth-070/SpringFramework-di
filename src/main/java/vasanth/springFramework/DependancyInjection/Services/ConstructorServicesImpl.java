package vasanth.springFramework.DependancyInjection.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorServicesImpl implements Services {
    @Override
    public String sayGreeting() {
        return "Constructor says Hello World!!!";
    }
}
