package com.friend.projectmanagement.service;

import com.friend.projectmanagement.dto.RoleUserDTO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Service
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface RoleUserService {
	/**
	 * 查询所有信息
	 *
	 * @return List<RoleUser> 记录集
	 */
	List<RoleUserDTO> findAll();

	/**
	 * 查询部分信息
	 *
	 * @param roleUserDTO 过滤信息
	 * @return List<RoleUserDTO> 记录集
	 */
	List<RoleUserDTO> findList(RoleUserDTO roleUserDTO);

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return RoleUserDTO 记录
	 */
	RoleUserDTO getById(String id);

	/**
	 * 获取单条记录
	 *
	 * @param roleUserDTO 过滤信息
	 * @return RoleUserDTO 记录
	 */
	RoleUserDTO get(RoleUserDTO roleUserDTO);

	/**
	 * 添加记录
	 *
	 * @param roleUserDTO 添加信息
	 * @return int 返回值
	 */
	int insert(RoleUserDTO roleUserDTO);

	/**
	 * 修改记录
	 *
	 * @param roleUserDTO 需要修改信息
	 * @return int 返回值
	 */
	int update(RoleUserDTO roleUserDTO);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return Page<RoleUserDTO> 分页信息
	 */
	PageInfo<RoleUserDTO> findPage(int pageNum, int pageSize);
}
