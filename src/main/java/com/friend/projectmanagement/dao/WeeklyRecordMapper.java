package com.friend.projectmanagement.dao;

import com.friend.projectmanagement.entity.WeeklyRecord;
import java.util.List;

public interface WeeklyRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(WeeklyRecord record);

    WeeklyRecord selectByPrimaryKey(String id);

    List<WeeklyRecord> selectAll();

    int updateByPrimaryKey(WeeklyRecord record);
}