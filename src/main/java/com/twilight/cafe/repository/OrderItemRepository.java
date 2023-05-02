package com.twilight.cafe.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twilight.cafe.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, UUID>{

}
