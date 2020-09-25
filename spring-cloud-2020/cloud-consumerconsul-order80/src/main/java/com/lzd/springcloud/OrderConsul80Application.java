package com.lzd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsul80Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(OrderConsul80Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞ Order Consul 80 启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
