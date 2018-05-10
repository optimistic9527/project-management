package com.friend.projectmanagement.dao;


import java.util.List;

/**
 * DAO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface WeeklyRecordDao<WeeklyRecord> {
	/**
	 * 查询所有信息
	 *
	 * @return List<WeeklyRecord> 记录集
	 */
	List<WeeklyRecord> findAll();

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return WeeklyRecord 记录
	 */
	WeeklyRecord getById(String id);

	/**
	 * 获取单挑记录
	 *
	 * @param weeklyRecord 过滤信息
	 * @return WeeklyRecord 记录
	 */
	WeeklyRecord get(WeeklyRecord weeklyRecord);

	/**
	 * 添加记录
	 *
	 * @param weeklyRecord 添加信息
	 * @return int 返回值
	 */
	int insert(WeeklyRecord weeklyRecord);

	/**
	 * 批量添加
	 *
	 * @param list 添加信息
	 */
	void batchAdd(List<WeeklyRecord> weeklyRecordList);

	/**
	 * 修改记录
	 *
	 * @param weeklyRecord 需要的修改信息
	 * @return int 返回值
	 */
	int update(WeeklyRecord weeklyRecord);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return List<WeeklyRecord> 记录集
	 */
	List<WeeklyRecord> findPage();

	/**
	 * 条件查询
	 *
	 * @param weeklyRecord 过滤条件
	 * @return List<WeeklyRecord> 记录集
	 */
	List<WeeklyRecord> findList(WeeklyRecord weeklyRecord);
}
