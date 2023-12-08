package com.user.ecommerce.dao;

import com.user.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, Long> {
}

