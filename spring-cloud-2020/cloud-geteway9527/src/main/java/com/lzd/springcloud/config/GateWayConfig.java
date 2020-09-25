package com.lzd.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig
{
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder)
    {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        RouteLocator routeLocator = routes.route("path_route_lzd",
                	  r -> r.path("/guoji")
                            .uri("http://news.baidu.com/guoji"))
        			.build();

        return routeLocator;
    }
}
