/**
 * 
 */
package com.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.feignClient.DcClient;

/**
 * @author PC
 *
 */
@RestController
public class DcController {
	@Autowired
	DcClient dcClient;
	
	@GetMapping("consumer")
	public String consumer() {
		System.out.println("this is consumer-feign");
		return dcClient.consumer();
	}
	
}
