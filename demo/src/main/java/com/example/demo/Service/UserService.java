package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;

import jakarta.validation.Valid;

@Service
public class UserService {

	
	@Autowired
	UserRepository userRepository;
	
	
	public Object creatUser(@Valid User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}


	public Object getAllUser() {
		// TODO Auto-generated method stub
		 return userRepository.findAll();
	}


//	public Object getAllUser() {
		// TODO Auto-generated method stub
//		return userRepository.findAll();
	//}
	
	

}
