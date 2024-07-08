package com.sharanya.gateway_servicems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServicemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServicemsApplication.class, args);
	}

}
