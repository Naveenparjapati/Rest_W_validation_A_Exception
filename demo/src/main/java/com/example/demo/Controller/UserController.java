package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

	
	
	
	@Autowired
	UserService userService;
	
	@PostMapping
	public ResponseEntity<Object>  creatUser(@Valid  @RequestBody User user)
	{
		return ResponseEntity.ok(userService.creatUser(user));
	}
}
