package com.lzd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard9001Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HystrixDashboard9001Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞHystrix Dashboard 9001启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
