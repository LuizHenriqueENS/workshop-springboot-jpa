package com.devluizhenrique.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devluizhenrique.coursespring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
