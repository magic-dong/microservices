package com.lzd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class Payment8002Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Payment8002Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞ Payment 8002启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
