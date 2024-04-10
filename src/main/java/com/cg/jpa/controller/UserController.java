package com.cg.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jpa.dao.UserRepository;
import com.cg.jpa.entities.User;
import com.cg.jpa.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
	//get user api
	//get user by id api
	//save(Create=post) user api
	//update=put user api
	//delete user api
	@Autowired
	private UserRepository userRepository;
	//get user
	@GetMapping("users")
	public List<User>getAllUsers(){
		return this.userRepository.findAll();
	}
	// get user by id
	@GetMapping("/users/{id}")
	public ResponseEntity<User>getUserById(@PathVariable(value = "id")Integer UserId)throws ResourceNotFoundException
	{
		User users=userRepository.findById(UserId).orElseThrow(()->new ResourceNotFoundException("User Not found for this id ::"+UserId));
		return ResponseEntity.ok().body(users);
	}
	//save user
	@PostMapping("users")
	public User createUser(@RequestBody User user)
	{
		return this.userRepository.save(user);
	}
	//update  user
	@PutMapping("/users/{id}")
	public ResponseEntity<User>updateUser(@PathVariable(value = "id") Integer userId,@Validated @RequestBody User userDetails) throws ResourceNotFoundException
	{
		User user=userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("user not found for this id ::"+userId));
		user.setCity(userDetails.getCity());
		user.setName(userDetails.getName());
		user.setStatus(userDetails.getStatus());
		final User updatedUser=userRepository.save(user);
		return ResponseEntity.ok(updatedUser);
	}
	//deletemapping

}
