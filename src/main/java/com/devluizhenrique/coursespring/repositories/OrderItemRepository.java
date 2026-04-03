package com.devluizhenrique.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devluizhenrique.coursespring.entities.OrderItem;
import com.devluizhenrique.coursespring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

	
}
