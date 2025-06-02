package com.order.orderserive.Service;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.order.orderserive.Repository.OrderRepository;
import com.order.orderserive.client.InventoryClient;
import com.order.orderserive.dto.OrderRequest;
import com.order.orderserive.model.Order;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor //generates constructor for final fields
public class OrderService {

    private final OrderRepository orderRepository;
    private InventoryClient inventoryClient;


    public  void placeOrder(OrderRequest orderRequest){
        var productInStock = inventoryClient.inStock(orderRequest.skuCode(), orderRequest.quantity());

        if(productInStock){
        //map order reuqest to order objects 
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());
        orderRepository.save(order);
        }else{
            throw new RuntimeException("Product is with skuCode"+ orderRequest.skuCode() + " is not in stock");
        }

        // testing
        // //save order object in list(orderrepo)
        // try {
        //     orderRepository.save(order);
        // } catch (Exception e) {
        //     e.printStackTrace(); // log what exactly is failing
        // }
        


    }
}
