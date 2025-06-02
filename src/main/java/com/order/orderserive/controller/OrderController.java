package com.order.orderserive.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.orderserive.Service.OrderService;
import com.order.orderserive.dto.OrderRequest;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

//controller
@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)   
    public String  placeOrder(@RequestBody OrderRequest orderRequest){
        try {
            System.out.println("Incoming order: " + orderRequest);
            orderService.placeOrder(orderRequest);
            return "Order Placed Successfully";
        } catch (Exception e) {
            // Log the exact cause of the 500 error
            e.printStackTrace();
            throw e; // rethrow to keep the test behavior
        }
        
    }
    
}
