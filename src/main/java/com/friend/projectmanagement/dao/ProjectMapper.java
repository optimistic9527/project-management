package com.friend.projectmanagement.dao;

import com.friend.projectmanagement.entity.Project;
import java.util.List;

public interface ProjectMapper {
    int deleteByPrimaryKey(String id);

    int insert(Project record);

    Project selectByPrimaryKey(String id);

    List<Project> selectAll();

    int updateByPrimaryKey(Project record);
}