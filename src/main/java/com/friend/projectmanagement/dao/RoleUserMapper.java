package com.friend.projectmanagement.dao;

import com.friend.projectmanagement.entity.RoleUser;
import java.util.List;

public interface RoleUserMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(RoleUser record);

    RoleUser selectByPrimaryKey(String roleId);

    List<RoleUser> selectAll();

    int updateByPrimaryKey(RoleUser record);
}