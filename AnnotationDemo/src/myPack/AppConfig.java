package myPack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "myPack")
public class AppConfig {
	/*@Bean
    public String greetingMessage() {
        return "Hello, Spring!";
    }*/
}
