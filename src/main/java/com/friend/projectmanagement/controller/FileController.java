package com.friend.projectmanagement.controller;


import com.friend.projectmanagement.dto.FileDTO;

/**
 * Controller
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface FileController {
	/**
	 * 添加File
	 *
	 * @param fileDTO
	 * @return
	 */
	String add(FileDTO fileDTO);

	/**
	 * 根据id删除File
	 *
	 * @param id
	 * @return
	 */
	String delete(String id);

	/**
	 * 修改File
	 *
	 * @param fileDTO
	 * @return
	 */
	String update(FileDTO fileDTO);

	/**
	 * 根据id获取File信息
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
