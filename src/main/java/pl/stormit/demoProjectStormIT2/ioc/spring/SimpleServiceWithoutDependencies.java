package pl.stormit.demoProjectStormIT2.ioc.spring;

import org.springframework.stereotype.Service;

@Service
public class SimpleServiceWithoutDependencies {
    public String method() {
        return getClass().getSimpleName();
    }
}
