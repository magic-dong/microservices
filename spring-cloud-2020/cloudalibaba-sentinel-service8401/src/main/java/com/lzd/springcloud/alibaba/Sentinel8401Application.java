package com.lzd.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Sentinel8401Application
{
    public static void main(String[] args) {
        SpringApplication.run(Sentinel8401Application.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞAlibaba Sentinel 8401启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
