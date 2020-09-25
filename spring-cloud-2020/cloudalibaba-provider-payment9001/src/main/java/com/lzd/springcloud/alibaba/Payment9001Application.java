package com.lzd.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Payment9001Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Payment9001Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞAlibaba Payment 9001启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
