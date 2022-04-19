package pl.stormit.demoProjectStormIT2.ioc.spring;

import org.springframework.stereotype.Service;

@Service
public class ServiceDIConstructor {
    private final ServiceA serviceA;

    public ServiceDIConstructor(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public String method() {
        return serviceA.method();
    }
}
