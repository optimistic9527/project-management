package com.friend.projectmanagement.dao;


import java.util.List;

/**
 * DAO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface ObjectiveDao<Objective> {
	/**
	 * 查询所有信息
	 *
	 * @return List<Objective> 记录集
	 */
	List<Objective> findAll();

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return Objective 记录
	 */
	Objective getById(String id);

	/**
	 * 获取单挑记录
	 *
	 * @param objective 过滤信息
	 * @return Objective 记录
	 */
	Objective get(Objective objective);

	/**
	 * 添加记录
	 *
	 * @param objective 添加信息
	 * @return int 返回值
	 */
	int insert(Objective objective);

	/**
	 * 批量添加
	 *
	 * @param list 添加信息
	 */
	void batchAdd(List<Objective> objectiveList);

	/**
	 * 修改记录
	 *
	 * @param objective 需要的修改信息
	 * @return int 返回值
	 */
	int update(Objective objective);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return List<Objective> 记录集
	 */
	List<Objective> findPage();

	/**
	 * 条件查询
	 *
	 * @param objective 过滤条件
	 * @return List<Objective> 记录集
	 */
	List<Objective> findList(Objective objective);
}
