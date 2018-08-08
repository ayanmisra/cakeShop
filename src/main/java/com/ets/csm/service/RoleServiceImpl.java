package com.ets.csm.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.Role;
import com.ets.csm.repository.RoleRepository;

@Service("roleService")
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public void add(Role role) {
		// TODO Auto-generated method stub
		roleRepository.save(role);
	}

	@Override
	public Set<Role> getRoleByID(Integer id) {
		// TODO Auto-generated method stub
		return roleRepository.getRoleByID(id);
	}
	
	
	

}

