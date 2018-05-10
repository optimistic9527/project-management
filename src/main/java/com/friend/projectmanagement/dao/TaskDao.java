package com.friend.projectmanagement.dao;


import java.util.List;

/**
 * DAO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface TaskDao<Task> {
	/**
	 * 查询所有信息
	 *
	 * @return List<Task> 记录集
	 */
	List<Task> findAll();

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return Task 记录
	 */
	Task getById(String id);

	/**
	 * 获取单挑记录
	 *
	 * @param task 过滤信息
	 * @return Task 记录
	 */
	Task get(Task task);

	/**
	 * 添加记录
	 *
	 * @param task 添加信息
	 * @return int 返回值
	 */
	int insert(Task task);

	/**
	 * 批量添加
	 *
	 * @param list 添加信息
	 */
	void batchAdd(List<Task> taskList);

	/**
	 * 修改记录
	 *
	 * @param task 需要的修改信息
	 * @return int 返回值
	 */
	int update(Task task);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return List<Task> 记录集
	 */
	List<Task> findPage();

	/**
	 * 条件查询
	 *
	 * @param task 过滤条件
	 * @return List<Task> 记录集
	 */
	List<Task> findList(Task task);
}
