package com.lzd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigCenter3344Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigCenter3344Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞConfig Center 3344启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
