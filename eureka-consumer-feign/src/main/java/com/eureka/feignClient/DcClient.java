/**
 * 
 */
package com.eureka.feignClient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author PC
 *
 */
@FeignClient("eureka-client")
public interface DcClient {
	@GetMapping("info")
	String consumer();
}
