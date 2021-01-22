package edu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/")
public class DemoController {

	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping(value = "hello/{username}", method = RequestMethod.GET)
	public String hello(@PathVariable("username") String username) {
		ServiceInstance instance = client.getLocalServiceInstance();
		System.out.println("host is: " + instance.getHost());
		System.out.println("port is: " + instance.getPort());
		System.out.println("ServiceId is: " + instance.getServiceId());
		
		return "hello " + username;
	}
	
}
