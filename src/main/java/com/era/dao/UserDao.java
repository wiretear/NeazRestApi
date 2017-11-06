package com.era.dao;

import java.util.List;

import com.era.model.User;

public interface UserDao {

	User findById(Integer id);
	List<User> findAll();
	void save(User user);
	void update(User user);
	void delete(Integer id);
	User validateUser(User login);
/*
	
	 public List<User> getUser();
	 public User getUser(int employeeId);
	 public int deleteUser(int employeeId); 
	 */
}