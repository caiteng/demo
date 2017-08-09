package com.demo.service;

import com.demo.entity.Permission;
import com.demo.entity.Role;
import com.demo.entity.User;
import com.demo.mapper.RoleMapper;
import com.demo.mapper.UserMapper;
import com.demo.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017-07-25.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;

    public User get(int id)  {
        User users = userMapper.selectByPrimaryKey(id);
        return users;
    }

    /**
     * 根据用户名查询用户
     * @param name
     * @return
     */
    public User getByName(String name){
        return userMapper.getByName(name);
    }

    public List<User> getAll(){
       return userMapper.getAll();
    }

    public Set<Role> findRoles(String username) {
        return null;
    }

    public Set<Permission> findPermissions(String username) {
        return null;
    }

    public User findByUsername(String username) {
        return null;
    }

}
