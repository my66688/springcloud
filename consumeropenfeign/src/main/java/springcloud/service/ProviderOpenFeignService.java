package springcloud.service;

import entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@ComponentScan
@FeignClient(value ="PROVIDER")//使用Feign
public interface ProviderOpenFeignService {
    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id);

    //调用生产者微服务名称为PROVIDER下边的模拟超时的接口
    @GetMapping("/payment/openfeign/timeout")
    public String PaymentOpenFeignTimeOut() throws InterruptedException;
}
