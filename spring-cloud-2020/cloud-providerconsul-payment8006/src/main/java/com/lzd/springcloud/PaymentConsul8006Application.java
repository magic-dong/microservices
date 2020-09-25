package com.lzd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8006Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(PaymentConsul8006Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞ Payment Consul 8006启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
