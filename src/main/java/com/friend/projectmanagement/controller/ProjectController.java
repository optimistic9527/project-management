package com.friend.projectmanagement.controller;


import com.friend.projectmanagement.dto.ProjectDTO;

/**
 * Controller
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface ProjectController {
	/**
	 * 添加Project
	 *
	 * @param projectDTO
	 * @return
	 */
	String add(ProjectDTO projectDTO);

	/**
	 * 根据id删除Project
	 *
	 * @param id
	 * @return
	 */
	String delete(String id);

	/**
	 * 修改Project
	 *
	 * @param projectDTO
	 * @return
	 */
	String update(ProjectDTO projectDTO);

	/**
	 * 根据id获取Project信息
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
