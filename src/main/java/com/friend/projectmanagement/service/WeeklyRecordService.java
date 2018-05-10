package com.friend.projectmanagement.service;

import com.friend.projectmanagement.dto.WeeklyRecordDTO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Service
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface WeeklyRecordService {
	/**
	 * 查询所有信息
	 *
	 * @return List<WeeklyRecord> 记录集
	 */
	List<WeeklyRecordDTO> findAll();

	/**
	 * 查询部分信息
	 *
	 * @param weeklyRecordDTO 过滤信息
	 * @return List<WeeklyRecordDTO> 记录集
	 */
	List<WeeklyRecordDTO> findList(WeeklyRecordDTO weeklyRecordDTO);

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return WeeklyRecordDTO 记录
	 */
	WeeklyRecordDTO getById(String id);

	/**
	 * 获取单条记录
	 *
	 * @param weeklyRecordDTO 过滤信息
	 * @return WeeklyRecordDTO 记录
	 */
	WeeklyRecordDTO get(WeeklyRecordDTO weeklyRecordDTO);

	/**
	 * 添加记录
	 *
	 * @param weeklyRecordDTO 添加信息
	 * @return int 返回值
	 */
	int insert(WeeklyRecordDTO weeklyRecordDTO);

	/**
	 * 修改记录
	 *
	 * @param weeklyRecordDTO 需要修改信息
	 * @return int 返回值
	 */
	int update(WeeklyRecordDTO weeklyRecordDTO);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return Page<WeeklyRecordDTO> 分页信息
	 */
	PageInfo<WeeklyRecordDTO> findPage(int pageNum, int pageSize);
}
