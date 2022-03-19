package pl.stormit.demoProjectStormIT2.beanCreation;

import org.springframework.stereotype.Component;

/**
 * Exc.3 bean creating to show  1st way to get access to bean context  (look on Test TaskBeanCreation)
 */
@Component   //also @Service could be used
public class Task1Bean {

    public String method() {
        return getClass().getSimpleName();
    }

}
