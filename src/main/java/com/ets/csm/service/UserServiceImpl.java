package com.ets.csm.service;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ets.csm.model.Role;
import com.ets.csm.model.User;
import com.ets.csm.repository.RoleRepository;
import com.ets.csm.repository.UserRepository;

@Service("userService")
public class UserServiceImpl  implements UserService  {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
	}
	
	 public List getAllUser() {
		
		return userRepository.getAllUser();
		
	}
	 
	 public List getUserDataByID(String email) {
		 
		 
		 return userRepository.getUserDataByID(email);
	 }
	 
	 public Optional<User> findById(Long id) {
		 
		 return userRepository.findById(id);
	 }
	 
	 public User saveOrUpdate(User user) {
		 
		 return userRepository.save(user);
	 }
	 
	 
	 public List getAll() {
		 
		 return userRepository.findAll();
	 }

	@Override
	public List getUserName() {
		// TODO Auto-generated method stub
	
		return userRepository.getUserName();
	}

	@Override
	public void remove(User user) {
		userRepository.delete(user);
		
	}
	 
	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepository.getUserByUserName(userName);
	}

	@Override
	public List getActiveUser() {
		// TODO Auto-generated method stub
		return userRepository.getActiveUser();
	}

	@Override
	public List getInactiveUser() {
		// TODO Auto-generated method stub
		return userRepository.getInactiveUser();
	}
	 
	
	 
	 
}
