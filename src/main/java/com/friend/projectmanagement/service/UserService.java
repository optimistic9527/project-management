package com.friend.projectmanagement.service;

import com.friend.projectmanagement.dto.UserDTO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Service
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface UserService {
	/**
	 * 查询所有信息
	 *
	 * @return List<User> 记录集
	 */
	List<UserDTO> findAll();

	/**
	 * 查询部分信息
	 *
	 * @param userDTO 过滤信息
	 * @return List<UserDTO> 记录集
	 */
	List<UserDTO> findList(UserDTO userDTO);

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return UserDTO 记录
	 */
	UserDTO getById(String id);

	/**
	 * 获取单条记录
	 *
	 * @param userDTO 过滤信息
	 * @return UserDTO 记录 查询不到返回null
	 */
	UserDTO get(UserDTO userDTO);

	/**
	 * 添加记录
	 *
	 * @param userDTO 添加信息
	 * @return int 返回值
	 */
	int insert(UserDTO userDTO);

	/**
	 * 修改记录
	 *
	 * @param userDTO 需要修改信息
	 * @return int 返回值
	 */
	int update(UserDTO userDTO);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return Page<UserDTO> 分页信息
	 */
	PageInfo<UserDTO> findPage(int pageNum, int pageSize);

	/**
	 * 根据用户名密码查找用户
	 *
	 * @param username
	 * @param pwd
	 * @return 查询不到时，返回null
	 */
	UserDTO findUserByUsernamePassword(String username, String pwd);
}
