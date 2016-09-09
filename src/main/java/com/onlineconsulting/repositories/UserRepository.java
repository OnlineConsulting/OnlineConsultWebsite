package com.onlineconsulting.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.onlineconsulting.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByLastName(String lastName);
}