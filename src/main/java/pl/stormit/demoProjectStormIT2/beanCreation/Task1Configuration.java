package pl.stormit.demoProjectStormIT2.beanCreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Task1Configuration {

    @Bean
    public Task1Class task1Class() {
        return new Task1Class();
    }
}
