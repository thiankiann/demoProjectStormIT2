package pl.stormit.demoProjectStormIT2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
		SpringApplication.run(DemoProjectStormIt2Application.class, args);
	}

}
