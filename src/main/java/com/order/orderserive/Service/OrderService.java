package com.order.orderserive.Service;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.order.orderserive.Repository.OrderRepository;
import com.order.orderserive.dto.OrderRequest;
import com.order.orderserive.model.Order;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor //generates constructor for final fields
public class OrderService {

    private final OrderRepository orderRepository;


    public  void placeOrder(OrderRequest orderRequest){
        //map order reuqest to order objects 
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());

        //save order object in list(orderrepo)
        orderRepository.save(order);



    }
}
