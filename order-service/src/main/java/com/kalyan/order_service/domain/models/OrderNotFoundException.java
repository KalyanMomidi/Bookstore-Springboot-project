package com.kalyan.order_service.domain.models;

public class OrderNotFoundExceoption extends RuntimeException {
    public OrderNotFoundExceoption(String message) {
        super(message);
    }
}
