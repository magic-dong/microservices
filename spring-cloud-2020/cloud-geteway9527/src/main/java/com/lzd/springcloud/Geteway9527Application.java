package com.lzd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.lzd.myrule.MySelfRule;

/**
 * 	注意：若网关geteway想下面@RibbonClient负载均衡策略生效，属性服务名必须和yml中路由策略中的
 *  uri: lb://cloud-payment-service 服务名一致，区分大小写
 * @author lzd
 *
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "cloud-payment-service",configuration=MySelfRule.class)
public class Geteway9527Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Geteway9527Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞGeteway 9527启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
