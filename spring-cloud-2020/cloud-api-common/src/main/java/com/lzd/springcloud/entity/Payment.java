package com.lzd.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @auther lzd
 * @create 2020-08-21 17:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable
{
	private static final long serialVersionUID = -5357717081287336111L;
	
	private Long id;
    private String serial;
}
