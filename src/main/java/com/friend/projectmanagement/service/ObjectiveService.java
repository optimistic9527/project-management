package com.friend.projectmanagement.service;

import com.friend.projectmanagement.dto.ObjectiveDTO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Service
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface ObjectiveService {
	/**
	 * 查询所有信息
	 *
	 * @return List<Objective> 记录集
	 */
	List<ObjectiveDTO> findAll();

	/**
	 * 查询部分信息
	 *
	 * @param objectiveDTO 过滤信息
	 * @return List<ObjectiveDTO> 记录集
	 */
	List<ObjectiveDTO> findList(ObjectiveDTO objectiveDTO);

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return ObjectiveDTO 记录
	 */
	ObjectiveDTO getById(String id);

	/**
	 * 获取单条记录
	 *
	 * @param objectiveDTO 过滤信息
	 * @return ObjectiveDTO 记录
	 */
	ObjectiveDTO get(ObjectiveDTO objectiveDTO);

	/**
	 * 添加记录
	 *
	 * @param objectiveDTO 添加信息
	 * @return int 返回值
	 */
	int insert(ObjectiveDTO objectiveDTO);

	/**
	 * 修改记录
	 *
	 * @param objectiveDTO 需要修改信息
	 * @return int 返回值
	 */
	int update(ObjectiveDTO objectiveDTO);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return Page<ObjectiveDTO> 分页信息
	 */
	PageInfo<ObjectiveDTO> findPage(int pageNum, int pageSize);
}
