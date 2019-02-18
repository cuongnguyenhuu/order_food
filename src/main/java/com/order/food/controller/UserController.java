package com.order.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.food.entity.User;
import com.order.food.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	private UserService userService;
	 
	@GetMapping("")
	public ResponseEntity<User> getAll(){
		return new ResponseEntity(userService.getAllUSer(),HttpStatus.OK);
	}
	@PostMapping("")
	public ResponseEntity<User> addOne(@RequestBody User user){
		return new ResponseEntity(userService.addOne(user),HttpStatus.OK);
	}
}
