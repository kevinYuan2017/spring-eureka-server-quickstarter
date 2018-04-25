package com.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientUploadServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(
				EurekaClientUploadServerApplication.class)
                .web(true).run(args);
		// emergency! eureka may be incorrectly claiming instances are up when they're not. 
		// renewals are lesser than threshold and hence the instances are not being expired just to be safe.
	}
}
