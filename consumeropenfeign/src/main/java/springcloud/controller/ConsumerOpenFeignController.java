package springcloud.controller;

import entity.CommonResult;
import entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springcloud.service.ProviderOpenFeignService;

@RestController
@Slf4j
public class ConsumerOpenFeignController {
    @Autowired
    private ProviderOpenFeignService providerOpenFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        CommonResult result = providerOpenFeignService.queryById(id);
        return result;
    }

    @GetMapping("/consumer/openfeign/timeout")
    public String PaymentOpenFeignTimeOut() throws InterruptedException{
        return providerOpenFeignService.PaymentOpenFeignTimeOut();
    }
}
