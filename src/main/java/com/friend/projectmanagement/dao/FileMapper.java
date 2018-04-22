package com.friend.projectmanagement.dao;

import com.friend.projectmanagement.entity.File;
import java.util.List;

public interface FileMapper {
    int deleteByPrimaryKey(String id);

    int insert(File record);

    File selectByPrimaryKey(String id);

    List<File> selectAll();

    int updateByPrimaryKey(File record);
}