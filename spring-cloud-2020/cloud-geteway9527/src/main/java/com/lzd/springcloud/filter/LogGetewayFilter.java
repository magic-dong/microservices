package com.lzd.springcloud.filter;

import java.util.Date;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * 全局过滤器
 * @author lzd
 *
 */
//@Component 全局过滤，测试需注入这个类，撤销注释即可
@Slf4j
public class LogGetewayFilter implements GlobalFilter,Ordered{
	
	@Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain)
    {
        log.info("***********come in LogGateWayFilter:  "+new Date());

        String userName = exchange.getRequest().getQueryParams().getFirst("userName");

        if(userName == null || !"lzd".equals(userName))
        {
            log.info("*******用户名为非法用户，o(╥﹏╥)o");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }

        return chain.filter(exchange);
    }

    @Override
    public int getOrder()
    {
        return 0;
    }
    
}
