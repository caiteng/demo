package com.demo.mapper;

import com.demo.entity.UserRole;

import java.util.List;
import java.util.Set;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> findRoleByUserId(int user_id);
}