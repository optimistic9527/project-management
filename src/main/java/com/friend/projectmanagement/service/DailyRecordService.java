package com.friend.projectmanagement.service;

import com.friend.projectmanagement.dto.DailyRecordDTO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Service
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface DailyRecordService {
	/**
	 * 查询所有信息
	 *
	 * @return List<DailyRecord> 记录集
	 */
	List<DailyRecordDTO> findAll();

	/**
	 * 查询部分信息
	 *
	 * @param dailyRecordDTO 过滤信息
	 * @return List<DailyRecordDTO> 记录集
	 */
	List<DailyRecordDTO> findList(DailyRecordDTO dailyRecordDTO);

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return DailyRecordDTO 记录
	 */
	DailyRecordDTO getById(String id);

	/**
	 * 获取单条记录
	 *
	 * @param dailyRecordDTO 过滤信息
	 * @return DailyRecordDTO 记录
	 */
	DailyRecordDTO get(DailyRecordDTO dailyRecordDTO);

	/**
	 * 添加记录
	 *
	 * @param dailyRecordDTO 添加信息
	 * @return int 返回值
	 */
	int insert(DailyRecordDTO dailyRecordDTO);

	/**
	 * 修改记录
	 *
	 * @param dailyRecordDTO 需要修改信息
	 * @return int 返回值
	 */
	int update(DailyRecordDTO dailyRecordDTO);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return Page<DailyRecordDTO> 分页信息
	 */
	PageInfo<DailyRecordDTO> findPage(int pageNum, int pageSize);
}
