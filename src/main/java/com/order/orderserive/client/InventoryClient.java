package com.order.orderserive.client;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;


public interface InventoryClient{

    @GetExchange("/api/inventory")
    boolean inStock(@RequestParam("skuCode") String skuCode, @RequestParam("quantity") Integer quantity);

    
}