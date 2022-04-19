package pl.stormit.demoProjectStormIT2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import pl.stormit.demoProjectStormIT2.ioc.spring.ServiceDIConstructor;
import pl.stormit.demoProjectStormIT2.ioc.spring.ServiceDISetter;
import pl.stormit.demoProjectStormIT2.ioc.spring.SimpleServiceWithoutDependencies;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TaskIoc {

    @Autowired
    ApplicationContext context;

    @Autowired
   private SimpleServiceWithoutDependencies service;

    @Test
    void shouldInjectService() {
        //given
        // field service with @Autowired

        //when
        String response = service.method();

        //then
        assertThat(response)
                .isEqualTo(SimpleServiceWithoutDependencies.class.getSimpleName());

    }
    @Test
    void shouldInjectionDependenciesWithConstructor() {

        //given
        ServiceDIConstructor bean = context.getBean(ServiceDIConstructor.class);

        //when
        String result = bean.method();

        //then
        assertThat(result).isEqualTo("ServiceA");
    }
    @Test
    void shouldInjectionDependenciesWithSetter() {

        //given
        ServiceDISetter bean = context.getBean(ServiceDISetter.class);

        //when
        String result = bean.method();

        // then
        assertThat(result).isEqualTo("ServiceA");
    }
}
