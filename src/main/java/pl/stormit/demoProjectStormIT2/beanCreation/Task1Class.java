package pl.stormit.demoProjectStormIT2.beanCreation;

/**
 * Exc.4 different way of creating a bean (look Task1Configuration)  + to get access to bean context (look on Test TaskBeanCreation)
 */
public class Task1Class {
    public String method() {
        return getClass().getSimpleName();
    }
}
