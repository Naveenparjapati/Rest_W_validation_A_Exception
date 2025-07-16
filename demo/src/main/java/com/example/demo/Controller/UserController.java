package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping
	public ResponseEntity<Object> getAllUser()
	{
		return ResponseEntity.ok(userService.getAllUser());
	}
	
	 @GetMapping("/{id}")
	    public ResponseEntity<User> getUserById(@PathVariable Long id) {
	        return userService.getUserById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }
	 
	 @PutMapping("/{id}")
	    public ResponseEntity<User> updateUser(@PathVariable Long id, @Valid @RequestBody User userDetails) {
	        return ResponseEntity.ok(userService.updateUser(id, userDetails));
	    }
	
}
