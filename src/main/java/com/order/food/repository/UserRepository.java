package com.order.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.food.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
