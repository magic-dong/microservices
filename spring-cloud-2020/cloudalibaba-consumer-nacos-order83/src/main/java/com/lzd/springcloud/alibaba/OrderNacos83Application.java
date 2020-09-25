package com.lzd.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacos83Application
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderNacos83Application.class,args);
        System.out.println("(♥◠‿◠)ﾉﾞAlibaba Order 83启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
