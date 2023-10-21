package com.luigisoares.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luigisoares.project.entities.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
