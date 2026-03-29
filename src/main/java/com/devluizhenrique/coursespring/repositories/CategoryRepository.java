package com.devluizhenrique.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devluizhenrique.coursespring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
