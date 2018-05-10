package com.friend.projectmanagement.dao;


import java.util.List;

/**
 * DAO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface RoleDao<Role> {
	/**
	 * 查询所有信息
	 *
	 * @return List<Role> 记录集
	 */
	List<Role> findAll();

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return Role 记录
	 */
	Role getById(String id);

	/**
	 * 获取单挑记录
	 *
	 * @param role 过滤信息
	 * @return Role 记录
	 */
	Role get(Role role);

	/**
	 * 添加记录
	 *
	 * @param role 添加信息
	 * @return int 返回值
	 */
	int insert(Role role);

	/**
	 * 批量添加
	 *
	 * @param list 添加信息
	 */
	void batchAdd(List<Role> roleList);

	/**
	 * 修改记录
	 *
	 * @param role 需要的修改信息
	 * @return int 返回值
	 */
	int update(Role role);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return List<Role> 记录集
	 */
	List<Role> findPage();

	/**
	 * 条件查询
	 *
	 * @param role 过滤条件
	 * @return List<Role> 记录集
	 */
	List<Role> findList(Role role);
}
