package com.example.consumerservice.service;

import com.example.consumerservice.entity.Order;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    List<Order> getOrders();
    Order getOrder(UUID id);
    Order saveOrder(Order order);
}
