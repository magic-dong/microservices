package com.lzd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class OrderZK80Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(OrderZK80Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞ Order ZK 80 启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
