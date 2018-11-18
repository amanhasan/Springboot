package io.javabrains.repository;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.modal.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByUsernameAndPassword(String username, String password);
}