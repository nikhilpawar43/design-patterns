package com.udemy.patterns.structural.facade;

import java.math.BigDecimal;

public class Order {
    
    private String productName;
    private long quantity;
    private BigDecimal cost;

    public Order(String productName, long quantity, BigDecimal cost) {
        this.productName = productName;
        this.quantity = quantity;
        this.cost = cost;
    }
}
