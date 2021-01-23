package edu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegisterServerCluster01App {

	public static void main(String[] args) {
		SpringApplication.run(RegisterServerCluster01App.class, args);
	}
	
}
