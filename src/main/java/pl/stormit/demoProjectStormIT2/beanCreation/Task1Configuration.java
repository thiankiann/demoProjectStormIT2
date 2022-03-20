package pl.stormit.demoProjectStormIT2.beanCreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Task1Configuration {

    @Bean        //to Task1Class
    public Task1Class task1Class() {
        return new Task1Class();
    }

    @Bean       //to Task1Interface
    public Task1Interface task1Interface() {
        return new Task1Interface() {
            @Override
            public String method() {
                return Task1Interface.class.getName();
            }
        };
    }
}
