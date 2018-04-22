package com.friend.projectmanagement.dao;

import com.friend.projectmanagement.entity.KeyResult;
import java.util.List;

public interface KeyResultMapper {
    int deleteByPrimaryKey(String id);

    int insert(KeyResult record);

    KeyResult selectByPrimaryKey(String id);

    List<KeyResult> selectAll();

    int updateByPrimaryKey(KeyResult record);
}