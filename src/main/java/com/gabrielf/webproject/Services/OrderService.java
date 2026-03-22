package com.gabrielf.webproject.Services;

import com.gabrielf.webproject.entities.Order;
import com.gabrielf.webproject.entities.User;
import com.gabrielf.webproject.repositories.OrderRepository;
import com.gabrielf.webproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
       Optional<Order> obj = repository.findById(id);
       return obj.get();
    }
}
