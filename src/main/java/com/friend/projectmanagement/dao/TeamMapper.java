package com.friend.projectmanagement.dao;

import com.friend.projectmanagement.entity.Team;
import java.util.List;

public interface TeamMapper {
    int deleteByPrimaryKey(String id);

    int insert(Team record);

    Team selectByPrimaryKey(String id);

    List<Team> selectAll();

    int updateByPrimaryKey(Team record);
}