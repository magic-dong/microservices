package com.lzd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //可以不用写，
					//原因：自动装配类中eureka.client.enabled和spring.cloud.service-registry.auto-registration.enabled默认都为true
@EnableFeignClients
public class OrderFeign80Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(OrderFeign80Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞ Ordern Feign 80启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
