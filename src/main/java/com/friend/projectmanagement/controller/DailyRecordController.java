package com.friend.projectmanagement.controller;


import com.friend.projectmanagement.dto.DailyRecordDTO;

/**
 * Controller
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface DailyRecordController {
	/**
	 * 添加DailyRecord
	 *
	 * @param dailyRecordDTO
	 * @return
	 */
	String add(DailyRecordDTO dailyRecordDTO);

	/**
	 * 根据id删除DailyRecord
	 *
	 * @param id
	 * @return
	 */
	String delete(String id);

	/**
	 * 修改DailyRecord
	 *
	 * @param dailyRecordDTO
	 * @return
	 */
	String update(DailyRecordDTO dailyRecordDTO);

	/**
	 * 根据id获取DailyRecord信息
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
