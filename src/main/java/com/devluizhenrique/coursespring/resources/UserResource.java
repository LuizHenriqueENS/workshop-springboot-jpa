package com.devluizhenrique.coursespring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devluizhenrique.coursespring.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> finAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "+5511999999999", "123456678");
		
		return ResponseEntity.ok().body(u);
	}
}
