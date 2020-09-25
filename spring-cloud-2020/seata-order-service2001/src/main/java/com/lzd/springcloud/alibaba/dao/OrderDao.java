package com.lzd.springcloud.alibaba.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lzd.springcloud.alibaba.entity.Order;

//@Mapper
public interface OrderDao
{
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId,@Param("status") Integer status);
    
    /**
     * 根据条件查询订单信息
     * @author lzd	
     * @date 2020年9月24日
     * @param params
     * @return
     */
    List<Order> selectBy(Map<String,Object> params);
}