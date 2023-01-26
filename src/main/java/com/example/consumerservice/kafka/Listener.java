package com.example.consumerservice.kafka;

import com.example.consumerservice.entity.Order;
import com.example.consumerservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Listener {

    private final OrderService orderService;

    @KafkaListener(topics = "order-topic")
    public void receiveOrder(ConsumerRecord<String, String> cr, @Payload Order order) {
        orderService.saveOrder(order);
    }
}
