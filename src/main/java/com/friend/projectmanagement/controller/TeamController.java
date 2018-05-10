package com.friend.projectmanagement.controller;


import com.friend.projectmanagement.dto.TeamDTO;

/**
 * Controller
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface TeamController {
	/**
	 * 添加Team
	 *
	 * @param teamDTO
	 * @return
	 */
	String add(TeamDTO teamDTO);

	/**
	 * 根据id删除Team
	 *
	 * @param id
	 * @return
	 */
	String delete(String id);

	/**
	 * 修改Team
	 *
	 * @param teamDTO
	 * @return
	 */
	String update(TeamDTO teamDTO);

	/**
	 * 根据id获取Team信息
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
