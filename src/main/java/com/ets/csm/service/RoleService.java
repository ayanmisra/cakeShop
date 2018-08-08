package com.ets.csm.service;

import java.util.Set;

import com.ets.csm.model.Role;

public interface RoleService {

	public void add(Role role);
	
	public Set<Role> getRoleByID(Integer id);
}
