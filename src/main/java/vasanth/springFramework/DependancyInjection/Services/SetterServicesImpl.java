package vasanth.springFramework.DependancyInjection.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterServicesImpl implements Services{
    @Override
    public String sayGreeting() {
        return "Setters says Hello World!!!";
    }
}
