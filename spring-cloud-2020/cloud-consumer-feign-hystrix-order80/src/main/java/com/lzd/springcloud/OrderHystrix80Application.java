package com.lzd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrix80Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(OrderHystrix80Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞ Order Hystrix 80启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
