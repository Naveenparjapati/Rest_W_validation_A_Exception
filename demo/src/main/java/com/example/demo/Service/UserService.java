package com.example.demo.Service;

import java.util.Optional;

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



		 public Optional<User> getUserById(Long id) {
		        return userRepository.findById(id);
		    }


		
	
		public User updateUser(Long id, User userDetails) {
	        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
	        user.setName(userDetails.getName());
	        user.setMail(userDetails.getMail());
	        return userRepository.save(user);
	    }


			
		public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }

//	public Object getAllUser() {
		// TODO Auto-generated method stub
//		return userRepository.findAll();
	//}
	
	

}
