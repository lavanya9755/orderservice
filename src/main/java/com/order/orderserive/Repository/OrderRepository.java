package com.order.orderserive.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.orderserive.model.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
    
}
