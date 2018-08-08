package com.ets.csm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.ets.csm.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public List getAllUser(); 
	public List getUserDataByID(String email);
	public Optional<User> findById(Long id);
	public User saveOrUpdate(User user);
	public List getAll();
	public List getUserName();
	public void remove(User user);
	public User getUserByUserName(String userName);
	public List  getActiveUser();
	public List getInactiveUser();
}