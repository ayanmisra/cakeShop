package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.User;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	 User findByEmail(String email);
   @Query("SELECT U.firstName, U.lastName,U.email, U.phone,U.country, U.active,U.userName FROM User U WHERE U.email!='admin'")
   public List getAllUser();
   
   @Query("SELECT U FROM User U WHERE U.email =:email")
   public List getUserDataByID(@Param ("email") String email);
   

   @Query("SELECT U.email FROM User U")
   public List getUserName();
   
   @Query("SELECT U FROM User U WHERE U.userName =:userName")
   public User getUserByUserName(@Param ("userName") String userName);
   
   @Query("SELECT U.firstName, U.lastName,U.email, U.phone,U.country, U.active,U.userName FROM User U WHERE U.active=1")
   public List getActiveUser();
   
   @Query("SELECT U.firstName, U.lastName,U.email, U.phone,U.country, U.active,U.userName FROM User U WHERE U.active=0")
   public List getInactiveUser();
}
