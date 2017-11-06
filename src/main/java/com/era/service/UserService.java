package com.era.service;

import java.util.List;

import com.era.model.User;

public interface UserService {

	User findById(Integer id);
	
	List<User> findAll();

	void saveOrUpdate(User user);
	
	void delete(int id);
	User validateUser(User login);


	/*
	public List<User>  getUser();
	 public User getUser(int id);
	 public int deleteUser(int id); 
	 //public int updateEmployee(User user);
	 //public int createEmployee(User user); 

	  */
}