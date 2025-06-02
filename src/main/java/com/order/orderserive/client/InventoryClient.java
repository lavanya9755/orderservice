package com.order.orderserive.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "inventory" , url ="http://localhost:8086")
public interface InventoryClient{

    @RequestMapping(method = RequestMethod.GET, value = "/api/inventory")
    boolean inStock(@RequestParam String skuCode,@RequestParam Integer quantity);
    
}