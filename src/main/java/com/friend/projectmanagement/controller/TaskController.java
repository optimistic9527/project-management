package com.friend.projectmanagement.controller;


import com.friend.projectmanagement.dto.TaskDTO;

/**
 * Controller
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface TaskController {
	/**
	 * 添加Task
	 *
	 * @param taskDTO
	 * @return
	 */
	String add(TaskDTO taskDTO);

	/**
	 * 根据id删除Task
	 *
	 * @param id
	 * @return
	 */
	String delete(String id);

	/**
	 * 修改Task
	 *
	 * @param taskDTO
	 * @return
	 */
	String update(TaskDTO taskDTO);

	/**
	 * 根据id获取Task信息
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
