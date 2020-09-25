package com.lzd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class Payment8004Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Payment8004Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞ Payment ZK 8004启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
