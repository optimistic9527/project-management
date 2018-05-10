package com.friend.projectmanagement.service;

import com.friend.projectmanagement.dto.ProjectDTO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Service
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface ProjectService {
	/**
	 * 查询所有信息
	 *
	 * @return List<Project> 记录集
	 */
	List<ProjectDTO> findAll();

	/**
	 * 查询部分信息
	 *
	 * @param projectDTO 过滤信息
	 * @return List<ProjectDTO> 记录集
	 */
	List<ProjectDTO> findList(ProjectDTO projectDTO);

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return ProjectDTO 记录
	 */
	ProjectDTO getById(String id);

	/**
	 * 获取单条记录
	 *
	 * @param projectDTO 过滤信息
	 * @return ProjectDTO 记录
	 */
	ProjectDTO get(ProjectDTO projectDTO);

	/**
	 * 添加记录
	 *
	 * @param projectDTO 添加信息
	 * @return int 返回值
	 */
	int insert(ProjectDTO projectDTO);

	/**
	 * 修改记录
	 *
	 * @param projectDTO 需要修改信息
	 * @return int 返回值
	 */
	int update(ProjectDTO projectDTO);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return Page<ProjectDTO> 分页信息
	 */
	PageInfo<ProjectDTO> findPage(int pageNum, int pageSize);
}
