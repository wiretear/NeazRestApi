package com.era.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.era.dao.UserDao;
import com.era.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User findById(Integer id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public void saveOrUpdate(User user) {

		if (findById(user.getId())==null) {
			userDao.save(user);
		} else {
			userDao.update(user);
		}

	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}
	@Override
	public User validateUser(User login) {
		// TODO Auto-generated method stub
		return  userDao.validateUser(login);
	}

/*
	 public List<User> getUser() {
		  List<User> user = userDao.getUser();
		  return user;
		 }

		 public User getUser(int id) {
		 User employee = userDao.getUser(id);
		  return employee;
		 }

		 public int deleteUser(int id) {
		  return userDao.deleteUser(id);
		 }
*/
}