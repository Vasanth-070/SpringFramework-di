package vasanth.springFramework.DependancyInjection.Services;

import org.springframework.stereotype.Service;

@Service
public class PropertyServicesImpl implements Services{
    @Override
    public String sayGreeting() {
        return "Properties says Hello World!!!";
    }
}
