package com.friend.projectmanagement.controller;


import com.friend.projectmanagement.dto.ObjectiveDTO;

/**
 * Controller
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface ObjectiveController {
	/**
	 * 添加Objective
	 *
	 * @param objectiveDTO
	 * @return
	 */
	String add(ObjectiveDTO objectiveDTO);

	/**
	 * 根据id删除Objective
	 *
	 * @param id
	 * @return
	 */
	String delete(String id);

	/**
	 * 修改Objective
	 *
	 * @param objectiveDTO
	 * @return
	 */
	String update(ObjectiveDTO objectiveDTO);

	/**
	 * 根据id获取Objective信息
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
