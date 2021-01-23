package edu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegisterServerCluster02App {

	public static void main(String[] args) {
		SpringApplication.run(RegisterServerCluster02App.class, args);
	}
	
}
