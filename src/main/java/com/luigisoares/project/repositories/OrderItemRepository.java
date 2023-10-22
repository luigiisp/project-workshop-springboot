package com.luigisoares.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luigisoares.project.entities.OrderItem;
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
