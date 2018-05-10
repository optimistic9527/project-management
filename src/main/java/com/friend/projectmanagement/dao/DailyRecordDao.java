package com.friend.projectmanagement.dao;


import java.util.List;

/**
 * DAO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface DailyRecordDao<DailyRecord> {
	/**
	 * 查询所有信息
	 *
	 * @return List<DailyRecord> 记录集
	 */
	List<DailyRecord> findAll();

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return DailyRecord 记录
	 */
	DailyRecord getById(String id);

	/**
	 * 获取单挑记录
	 *
	 * @param dailyRecord 过滤信息
	 * @return DailyRecord 记录
	 */
	DailyRecord get(DailyRecord dailyRecord);

	/**
	 * 添加记录
	 *
	 * @param dailyRecord 添加信息
	 * @return int 返回值
	 */
	int insert(DailyRecord dailyRecord);

	/**
	 * 批量添加
	 *
	 * @param list 添加信息
	 */
	void batchAdd(List<DailyRecord> dailyRecordList);

	/**
	 * 修改记录
	 *
	 * @param dailyRecord 需要的修改信息
	 * @return int 返回值
	 */
	int update(DailyRecord dailyRecord);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return List<DailyRecord> 记录集
	 */
	List<DailyRecord> findPage();

	/**
	 * 条件查询
	 *
	 * @param dailyRecord 过滤条件
	 * @return List<DailyRecord> 记录集
	 */
	List<DailyRecord> findList(DailyRecord dailyRecord);
}
