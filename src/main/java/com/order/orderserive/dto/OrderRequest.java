package com.order.orderserive.dto;

import java.math.BigDecimal;

public record OrderRequest(String skuCode,BigDecimal price,Integer quantity) {

}
