package com.onlinebank.icin.service;

import java.util.List;
import java.util.Set;

import com.onlinebank.icin.domain.User;
import com.onlinebank.icin.domain.security.UserRole;

public interface UserService {
	
	User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);

    void save (User user);

    User createUser(User user,Set<UserRole>userRole);
    
      User saveUser (User user); 
      
      List<User> findUserList();
      
      void enableUser (String username);
      
      void disableUser (String username);
}
