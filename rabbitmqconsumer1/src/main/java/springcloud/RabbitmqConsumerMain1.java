package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RabbitmqConsumerMain1 {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqConsumerMain1.class, args);
    }
}
