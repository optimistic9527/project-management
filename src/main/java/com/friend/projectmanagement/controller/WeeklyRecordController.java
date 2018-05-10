package com.friend.projectmanagement.controller;


import com.friend.projectmanagement.dto.WeeklyRecordDTO;

/**
 * Controller
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface WeeklyRecordController {
	/**
	 * 添加WeeklyRecord
	 *
	 * @param weeklyRecordDTO
	 * @return
	 */
	String add(WeeklyRecordDTO weeklyRecordDTO);

	/**
	 * 根据id删除WeeklyRecord
	 *
	 * @param id
	 * @return
	 */
	String delete(String id);

	/**
	 * 修改WeeklyRecord
	 *
	 * @param weeklyRecordDTO
	 * @return
	 */
	String update(WeeklyRecordDTO weeklyRecordDTO);

	/**
	 * 根据id获取WeeklyRecord信息
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
