package com.order.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.food.entity.User;
import com.order.food.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> getAllUSer(){
		return repository.findAll();
	}
	public User getById(int user_id) {
		return repository.getOne(user_id);
	}
	public User addOne(User user) {
		return repository.save(user);
	}
	public User updateOne(User user) {
		return repository.save(user);
	}
	public boolean deleteOne(int id) {
		User user = getById(id);
		if(user!=null) {
			repository.deleteById(id);
			return true;
		}
		else return false;
	}
}
