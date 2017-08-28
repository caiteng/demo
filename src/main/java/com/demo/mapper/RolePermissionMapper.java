package com.demo.mapper;

import com.demo.entity.RolePermission;

import java.util.List;
import java.util.Set;

public interface RolePermissionMapper {
    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    List<RolePermission> findermissionByRoleId(Integer id);
}