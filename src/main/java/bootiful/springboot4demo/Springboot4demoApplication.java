package bootiful.springboot4demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.resilience.annotation.Retryable;
import org.springframework.web.service.registry.ImportHttpServices;

@SpringBootApplication
@ImportHttpServices(basePackages = "bootiful.springboot4demo")
public class Springboot4demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot4demoApplication.class, args);
    }

    @Retryable(
            maxRetries = 3,
            delay = 2000,
            multiplier = 2,
            includes = IllegalAccessException.class
    )
    public String foo() {
        return "value";
    }

}
