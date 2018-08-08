package com.ets.csm.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.Role;



@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer>{
	Role findByRole(String role);

	   @Query("SELECT R FROM Role R WHERE R.id =:id")
	   public Set<Role> getRoleByID(@Param ("id") Integer id);
}