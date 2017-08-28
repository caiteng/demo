package com.demo.service;

import com.demo.entity.Permission;
import com.demo.entity.Role;
import com.demo.entity.User;

import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017-07-25.
 */
public interface UserService {

    User get(int id);

    List<User> getAll();

    Set<Role> findRoles(String username);

    Set<Permission> findPermissions(Set<Role> roles);

    User findByUsername(String username);
}
