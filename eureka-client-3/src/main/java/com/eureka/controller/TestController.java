/**
 * 
 */
package com.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yzk
 *
 */
@RestController
public class TestController {
	@Autowired
	private DiscoveryClient discoveryClient;
	@GetMapping("info")
	public Object hello() {
		String services = "Services: " + discoveryClient.description() + "==> " + discoveryClient.getServices();
//		System.out.println("this is client3");
		return services;
	}
}
