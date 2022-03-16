package pl.stormit.demoProjectStormIT2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
@RestController
public class DemoProjectStormIt2Application {
	/**
	 Exc.1 - simply app which use Get/@GetMapping and @RequestParam- adding variable
	 */
	@GetMapping("/hello")
	public String hello(@RequestParam(name = "name", defaultValue = "<>")String name){
		return String.format("Hello %s",name);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =SpringApplication.run(DemoProjectStormIt2Application.class, args);
/**
 Exc.2
  Printi all beans registered beans in Application Context
 */
		System.out.println(String.format("applicationContext => " + applicationContext.getClass().getCanonicalName()));

		//print all registered in beans in Spring (Application) Context
		String[] beanNames = applicationContext.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		int index = 1;
		for (String beanName : beanNames) {
			System.out.println(String.format("Bean [%s] -%s", index++, beanName));
		}

		// print particular bean
		//SpringEAIApplication bean =applicationContext.getBean(SpringEAIApplication.class);
	}

}
