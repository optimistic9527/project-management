package com.friend.projectmanagement.dao;


import java.util.List;

/**
 * DAO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface TeamDao<Team> {
	/**
	 * 查询所有信息
	 *
	 * @return List<Team> 记录集
	 */
	List<Team> findAll();

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return Team 记录
	 */
	Team getById(String id);

	/**
	 * 获取单挑记录
	 *
	 * @param team 过滤信息
	 * @return Team 记录
	 */
	Team get(Team team);

	/**
	 * 添加记录
	 *
	 * @param team 添加信息
	 * @return int 返回值
	 */
	int insert(Team team);

	/**
	 * 批量添加
	 *
	 * @param list 添加信息
	 */
	void batchAdd(List<Team> teamList);

	/**
	 * 修改记录
	 *
	 * @param team 需要的修改信息
	 * @return int 返回值
	 */
	int update(Team team);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return List<Team> 记录集
	 */
	List<Team> findPage();

	/**
	 * 条件查询
	 *
	 * @param team 过滤条件
	 * @return List<Team> 记录集
	 */
	List<Team> findList(Team team);
}
