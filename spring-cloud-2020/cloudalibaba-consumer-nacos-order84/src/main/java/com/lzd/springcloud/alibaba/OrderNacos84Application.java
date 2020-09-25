package com.lzd.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class OrderNacos84Application
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderNacos84Application.class,args);
        System.out.println("(♥◠‿◠)ﾉﾞAlibaba Order 84启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
