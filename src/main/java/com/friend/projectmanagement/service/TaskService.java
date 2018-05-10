package com.friend.projectmanagement.service;

import com.friend.projectmanagement.dto.TaskDTO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Service
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface TaskService {
	/**
	 * 查询所有信息
	 *
	 * @return List<Task> 记录集
	 */
	List<TaskDTO> findAll();

	/**
	 * 查询部分信息
	 *
	 * @param taskDTO 过滤信息
	 * @return List<TaskDTO> 记录集
	 */
	List<TaskDTO> findList(TaskDTO taskDTO);

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return TaskDTO 记录
	 */
	TaskDTO getById(String id);

	/**
	 * 获取单条记录
	 *
	 * @param taskDTO 过滤信息
	 * @return TaskDTO 记录
	 */
	TaskDTO get(TaskDTO taskDTO);

	/**
	 * 添加记录
	 *
	 * @param taskDTO 添加信息
	 * @return int 返回值
	 */
	int insert(TaskDTO taskDTO);

	/**
	 * 修改记录
	 *
	 * @param taskDTO 需要修改信息
	 * @return int 返回值
	 */
	int update(TaskDTO taskDTO);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return Page<TaskDTO> 分页信息
	 */
	PageInfo<TaskDTO> findPage(int pageNum, int pageSize);
}
