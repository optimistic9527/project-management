package com.friend.projectmanagement.dao;


import java.util.List;

/**
 * DAO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface RoleUserDao<RoleUser> {
	/**
	 * 查询所有信息
	 *
	 * @return List<RoleUser> 记录集
	 */
	List<RoleUser> findAll();

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return RoleUser 记录
	 */
	RoleUser getById(String id);

	/**
	 * 获取单挑记录
	 *
	 * @param roleUser 过滤信息
	 * @return RoleUser 记录
	 */
	RoleUser get(RoleUser roleUser);

	/**
	 * 添加记录
	 *
	 * @param roleUser 添加信息
	 * @return int 返回值
	 */
	int insert(RoleUser roleUser);

	/**
	 * 批量添加
	 *
	 * @param list 添加信息
	 */
	void batchAdd(List<RoleUser> roleUserList);

	/**
	 * 修改记录
	 *
	 * @param roleUser 需要的修改信息
	 * @return int 返回值
	 */
	int update(RoleUser roleUser);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return List<RoleUser> 记录集
	 */
	List<RoleUser> findPage();

	/**
	 * 条件查询
	 *
	 * @param roleUser 过滤条件
	 * @return List<RoleUser> 记录集
	 */
	List<RoleUser> findList(RoleUser roleUser);
}
