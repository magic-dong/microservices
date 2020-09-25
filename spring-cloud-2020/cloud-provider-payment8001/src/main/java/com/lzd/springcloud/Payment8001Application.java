package com.lzd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Payment8001Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Payment8001Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞ Payment 8001启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
