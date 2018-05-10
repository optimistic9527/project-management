package com.friend.projectmanagement.controller;


import com.friend.projectmanagement.dto.RoleUserDTO;

/**
 * Controller
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface RoleUserController {
	/**
	 * 添加RoleUser
	 *
	 * @param roleUserDTO
	 * @return
	 */
	String add(RoleUserDTO roleUserDTO);

	/**
	 * 根据id删除RoleUser
	 *
	 * @param id
	 * @return
	 */
	String delete(String id);

	/**
	 * 修改RoleUser
	 *
	 * @param roleUserDTO
	 * @return
	 */
	String update(RoleUserDTO roleUserDTO);

	/**
	 * 根据id获取RoleUser信息
	 *
	 * @param id
	 * @return
	 */
	String detail(String id);

	/**
	 * 分页
	 *
	 * @param pageSize 第几页
	 * @param pageNum  显示多少
	 * @return
	 */
	String listPage(int pageSize, int pageNum);
}
