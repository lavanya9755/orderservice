package com.order.orderserive.dto;

import java.math.BigDecimal;

public record OrderRequest(Long id,String OrderNumber,String skuCode,BigDecimal price,Integer quantity) {

}
