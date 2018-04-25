/**
 * 
 */
package com.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author PC
 *
 */
@RestController
public class DcController {
	@Autowired
	LoadBalancerClient loadBalancerClient;
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("consumer")
	public String consumer() {
		System.out.println("this is consumer-ribbon");
		return restTemplate.getForObject("http://eureka-client/info", String.class);
	}
	
}
