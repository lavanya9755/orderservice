package com.order.orderserive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.order.orderserive.client")
public class OrderseriveApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderseriveApplication.class, args);
	}

}
