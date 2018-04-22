package com.friend.projectmanagement.dao;

import com.friend.projectmanagement.entity.Role;
import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Role record);

    Role selectByPrimaryKey(String id);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}