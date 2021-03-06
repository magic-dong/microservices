package com.lzd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClient3355Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigClient3355Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞConfig Client 3355启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
