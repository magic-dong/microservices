package com.lzd.springcloud.alibaba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 项目启动路径
 * @author lzd
 * @date 2020年9月24日
 */
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan({"com.lzd.springcloud.alibaba.dao"})//扫描注入dao层，dao层中@Mapper注解可以不需要在写
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })//取消数据源的自动创建,使用seata代理数据源
public class SeataOrder2001Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SeataOrder2001Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞ Seata Order 2001启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
