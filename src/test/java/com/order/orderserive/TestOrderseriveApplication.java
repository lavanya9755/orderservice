package com.order.orderserive;

import org.springframework.boot.SpringApplication;

public class TestOrderseriveApplication {

	public static void main(String[] args) {
		SpringApplication.from(OrderseriveApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
