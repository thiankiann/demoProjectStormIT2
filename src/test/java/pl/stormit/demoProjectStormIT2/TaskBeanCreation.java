package pl.stormit.demoProjectStormIT2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import pl.stormit.demoProjectStormIT2.beanCreation.Task1Bean;
import pl.stormit.demoProjectStormIT2.beanCreation.Task1Class;
import pl.stormit.demoProjectStormIT2.beanCreation.Task1Interface;

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
    @Test
    void shouldCallBeanClass() {
        // given
        Task1Class bean = context.getBean(Task1Class.class);

        // when
        String result = bean.method();

        // then
        Assertions.assertThat(result).isEqualTo(Task1Class.class.getSimpleName());
    }
    @Test
    void shouldCallBeanInterface() {
        //given
        Task1Interface bean = context.getBean(Task1Interface.class);

        //when
        String result = bean.method();

        //then
        assertThat(result).isEqualTo(Task1Interface.class.getName());
    }

    @Test       //Exc.6 non-existing-bean
    void showThrowExceptionForNonExistingBean() {
        Throwable throwable = Assertions.catchThrowable(() -> context.getBean("non-existing-bean"));
        Assertions.assertThat(throwable)
                .isInstanceOf(NoSuchBeanDefinitionException.class)
                .hasMessage("No bean named 'non-existing-bean' available");

    }
}
