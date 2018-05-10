package com.friend.projectmanagement.service;

import com.friend.projectmanagement.dto.RoleDTO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Service
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface RoleService {
	/**
	 * 查询所有信息
	 *
	 * @return List<Role> 记录集
	 */
	List<RoleDTO> findAll();

	/**
	 * 查询部分信息
	 *
	 * @param roleDTO 过滤信息
	 * @return List<RoleDTO> 记录集
	 */
	List<RoleDTO> findList(RoleDTO roleDTO);

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return RoleDTO 记录
	 */
	RoleDTO getById(String id);

	/**
	 * 获取单条记录
	 *
	 * @param roleDTO 过滤信息
	 * @return RoleDTO 记录
	 */
	RoleDTO get(RoleDTO roleDTO);

	/**
	 * 添加记录
	 *
	 * @param roleDTO 添加信息
	 * @return int 返回值
	 */
	int insert(RoleDTO roleDTO);

	/**
	 * 修改记录
	 *
	 * @param roleDTO 需要修改信息
	 * @return int 返回值
	 */
	int update(RoleDTO roleDTO);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return Page<RoleDTO> 分页信息
	 */
	PageInfo<RoleDTO> findPage(int pageNum, int pageSize);
}
