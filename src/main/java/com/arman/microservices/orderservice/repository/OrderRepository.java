package com.arman.microservices.orderservice.repository;

import com.arman.microservices.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
