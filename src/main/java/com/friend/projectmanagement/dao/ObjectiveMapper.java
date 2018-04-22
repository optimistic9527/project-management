package com.friend.projectmanagement.dao;

import com.friend.projectmanagement.entity.Objective;
import java.util.List;

public interface ObjectiveMapper {
    int deleteByPrimaryKey(String id);

    int insert(Objective record);

    Objective selectByPrimaryKey(String id);

    List<Objective> selectAll();

    int updateByPrimaryKey(Objective record);
}