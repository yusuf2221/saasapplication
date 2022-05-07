package com.saas.application.tenant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saas.application.tenant.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
