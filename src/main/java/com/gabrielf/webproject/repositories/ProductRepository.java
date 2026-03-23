package com.gabrielf.webproject.repositories;

import com.gabrielf.webproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
