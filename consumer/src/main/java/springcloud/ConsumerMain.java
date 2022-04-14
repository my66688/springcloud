package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import ribbon.MyselfRule;

@SpringBootApplication
@EnableEurekaClient
//name为生产者服务的服务名称,configuration为配置类的类名
@RibbonClient(name = "PROVIDER",configuration = MyselfRule.class)
public class ConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain.class,args);
    }
}
