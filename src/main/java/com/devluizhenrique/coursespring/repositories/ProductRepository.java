package com.devluizhenrique.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devluizhenrique.coursespring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
