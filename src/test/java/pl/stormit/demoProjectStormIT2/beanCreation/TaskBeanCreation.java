package pl.stormit.demoProjectStormIT2.beanCreation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 1st way to get access to bean context (look on class Task1Bean)
@SpringBootTest
public class TaskBeanCreation {

    @Autowired
    ApplicationContext context;

    @Test
    void shouldCallBeanService() {

        //given
        Task1Bean bean = context.getBean(Task1Bean.class);

        //when
        String result = bean.method();

        //then
        assertThat(result).isEqualTo(Task1Bean.class.getSimpleName());
    }
}
