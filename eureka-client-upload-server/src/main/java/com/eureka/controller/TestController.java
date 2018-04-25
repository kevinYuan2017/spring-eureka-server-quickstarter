/**
 * 
 */
package com.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author yzk
 *
 */
@RestController
public class TestController {
	@GetMapping("uploadFile")
	public String uploadFile(@RequestPart(value = "file") MultipartFile file) {
		return file.getName();
	}
}
