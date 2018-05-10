package com.friend.projectmanagement.controller;


import com.friend.projectmanagement.dto.KeyResultDTO;

/**
 * Controller
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface KeyResultController {
	/**
	 * 添加KeyResult
	 *
	 * @param keyResultDTO
	 * @return
	 */
	String add(KeyResultDTO keyResultDTO);

	/**
	 * 根据id删除KeyResult
	 *
	 * @param id
	 * @return
	 */
	String delete(String id);

	/**
	 * 修改KeyResult
	 *
	 * @param keyResultDTO
	 * @return
	 */
	String update(KeyResultDTO keyResultDTO);

	/**
	 * 根据id获取KeyResult信息
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
