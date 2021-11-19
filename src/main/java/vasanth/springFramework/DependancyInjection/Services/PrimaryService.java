package vasanth.springFramework.DependancyInjection.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryService implements Services{
    @Override
    public String sayGreeting() {
        return "Primary says Hello World!!!";
    }
}
