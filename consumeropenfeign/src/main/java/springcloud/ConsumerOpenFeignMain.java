package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//激活Feign的注解,需要加到主启动类上
@EnableFeignClients
public class ConsumerOpenFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOpenFeignMain.class, args);
    }
}
