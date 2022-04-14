package springcloud;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
public class RabbitmqProviderMain {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqProviderMain.class, args);
    }
}
