package com.arman.microservices.orderservice.controller;

import com.arman.microservices.orderservice.common.Payment;
import com.arman.microservices.orderservice.common.TransactionRequest;
import com.arman.microservices.orderservice.common.TransactionResponse;
import com.arman.microservices.orderservice.entity.Order;
import com.arman.microservices.orderservice.service.OrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;
    
    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request) throws JsonProcessingException {
        return service.saveOrder(request);
    }
}
