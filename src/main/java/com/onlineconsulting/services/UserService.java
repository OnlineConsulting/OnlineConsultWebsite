package com.onlineconsulting.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlineconsulting.domain.User;
import com.onlineconsulting.repositories.UserRepository;

@Component
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<User> getUserByLastName(String lastName) {
		return userRepository.findByLastName(lastName);
	}
}
