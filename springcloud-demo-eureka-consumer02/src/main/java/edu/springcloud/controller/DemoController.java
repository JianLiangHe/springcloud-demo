package edu.springcloud.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Configuration
@RestController
@RequestMapping("/demo/")
public class DemoController {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String hello() {
		RestTemplate template = this.getRestTemplate();
		String retVal = template.getForEntity("http://sayHello/demo/hello/jack", String.class).getBody();
		return "In caller, " + retVal;
	}
	
}
