package com.lzd.springcloud.alibaba.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lzd.springcloud.alibaba.entity.CommonResult;
import com.lzd.springcloud.alibaba.entity.Order;
import com.lzd.springcloud.alibaba.service.OrderService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class OrderController
{
    @Resource
    private OrderService orderService;

    @GetMapping("/get/order")
    public CommonResult<?> selectOrder(@RequestParam Map<String,Object> params){
    	try {
    		List<Order> list = orderService.selectBy(params);
    		CommonResult<List<Order>> result=new CommonResult<List<Order>>(200, "success", list);
    		return result;
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.getMessage(),e);
			return new CommonResult<>(200, "查询失败！");
		}
    }

    //测试 eg:http://127.0.0.1:2001/order/create?userId=1&productId=1&count=10&money=100
    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
    	try {
    		 orderService.create(order);
    	     return new CommonResult(200,"订单创建成功！");
		} catch (Exception e) {
			// TODO: handle exception
		    log.error(e.getMessage(),e);
		    return new CommonResult(200,"订单创建失败！");
		}
    }
}
