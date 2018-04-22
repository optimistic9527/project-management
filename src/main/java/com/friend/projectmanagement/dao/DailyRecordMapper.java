package com.friend.projectmanagement.dao;

import com.friend.projectmanagement.entity.DailyRecord;
import java.util.List;

public interface DailyRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(DailyRecord record);

    DailyRecord selectByPrimaryKey(String id);

    List<DailyRecord> selectAll();

    int updateByPrimaryKey(DailyRecord record);
}