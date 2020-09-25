package com.lzd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.lzd.myrule.MySelfRule;


@SpringBootApplication
@EnableEurekaClient //可以不用写，
					//原因：自动装配类中eureka.client.enabled和spring.cloud.service-registry.auto-registration.enabled参数默认都为true
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration=MySelfRule.class)
public class Order80Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Order80Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞ Order 80启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
