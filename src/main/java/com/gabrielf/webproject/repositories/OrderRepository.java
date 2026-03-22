package com.gabrielf.webproject.repositories;

import com.gabrielf.webproject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
