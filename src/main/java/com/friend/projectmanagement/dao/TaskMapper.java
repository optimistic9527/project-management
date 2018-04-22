package com.friend.projectmanagement.dao;

import com.friend.projectmanagement.entity.Task;
import java.util.List;

public interface TaskMapper {
    int deleteByPrimaryKey(String id);

    int insert(Task record);

    Task selectByPrimaryKey(String id);

    List<Task> selectAll();

    int updateByPrimaryKey(Task record);
}