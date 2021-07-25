package com.onlinebank.icin.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.onlinebank.icin.domain.User;

public interface UserDao extends CrudRepository<User, Long>  {
	
    User findByUsername(String username);
    User findByEmail(String email);

    List<User> findAll();

}
