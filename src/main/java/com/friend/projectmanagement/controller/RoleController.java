package com.friend.projectmanagement.controller;


import com.friend.projectmanagement.dto.RoleDTO;

/**
 * Controller
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface RoleController {
	/**
	 * 添加Role
	 *
	 * @param roleDTO
	 * @return
	 */
	String add(RoleDTO roleDTO);

	/**
	 * 根据id删除Role
	 *
	 * @param id
	 * @return
	 */
	String delete(String id);

	/**
	 * 修改Role
	 *
	 * @param roleDTO
	 * @return
	 */
	String update(RoleDTO roleDTO);

	/**
	 * 根据id获取Role信息
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
