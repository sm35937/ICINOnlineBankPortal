package com.onlinebank.icin.Dao;

import org.springframework.data.repository.CrudRepository;

import com.onlinebank.icin.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Long> {
    Role findByName(String name);
}
