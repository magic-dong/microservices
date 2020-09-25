package com.lzd.springcloud.alibaba.service;

import java.util.List;
import java.util.Map;

import com.lzd.springcloud.alibaba.entity.Order;

public interface OrderService
{
	List<Order> selectBy(Map<String,Object> params);
	
    void create(Order order);
}
