package com.lzd.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClient3377Application
{
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClient3377Application.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞAlibaba Config Client 3377启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
