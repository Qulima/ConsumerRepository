package com.example.consumerservice.service;

import com.example.consumerservice.entity.Order;
import com.example.consumerservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository repository;
    @Override
    public List<Order> getOrders() {
        return repository.findAll();
    }

    @Override
    public Order getOrder(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Order with id=[%s] not found", id)));
    }

    @Override
    public Order saveOrder(Order order) {
        return repository.save(order);
    }
}
