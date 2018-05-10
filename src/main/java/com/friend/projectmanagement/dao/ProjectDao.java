package com.friend.projectmanagement.dao;


import java.util.List;

/**
 * DAO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface ProjectDao<Project> {
	/**
	 * 查询所有信息
	 *
	 * @return List<Project> 记录集
	 */
	List<Project> findAll();

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return Project 记录
	 */
	Project getById(String id);

	/**
	 * 获取单挑记录
	 *
	 * @param project 过滤信息
	 * @return Project 记录
	 */
	Project get(Project project);

	/**
	 * 添加记录
	 *
	 * @param project 添加信息
	 * @return int 返回值
	 */
	int insert(Project project);

	/**
	 * 批量添加
	 *
	 * @param list 添加信息
	 */
	void batchAdd(List<Project> projectList);

	/**
	 * 修改记录
	 *
	 * @param project 需要的修改信息
	 * @return int 返回值
	 */
	int update(Project project);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return List<Project> 记录集
	 */
	List<Project> findPage();

	/**
	 * 条件查询
	 *
	 * @param project 过滤条件
	 * @return List<Project> 记录集
	 */
	List<Project> findList(Project project);
}
