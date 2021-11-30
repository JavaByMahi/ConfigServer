package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudExternal_ConfigServer {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudExternal_ConfigServer.class, args);
		System.out.println("config server Exucuted.......");
	}

}
