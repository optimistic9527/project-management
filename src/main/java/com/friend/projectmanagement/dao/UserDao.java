package com.friend.projectmanagement.dao;


import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * DAO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface UserDao<User> {
	/**
	 * 查询所有信息
	 *
	 * @return List<User> 记录集
	 */
	List<User> findAll();

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return User 记录
	 */
	User getById(String id);

	/**
	 * 获取单挑记录
	 *
	 * @param user 过滤信息
	 * @return User 记录
	 */
	User get(User user);

	/**
	 * 添加记录
	 *
	 * @param user 添加信息
	 * @return int 返回值
	 */
	int insert(User user);

	/**
	 * 批量添加
	 *
	 * @param list 添加信息
	 */
	void batchAdd(List<User> userList);

	/**
	 * 修改记录
	 *
	 * @param user 需要的修改信息
	 * @return int 返回值
	 */
	int update(User user);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return List<User> 记录集
	 */
	List<User> findPage();

	/**
	 * 条件查询
	 *
	 * @param user 过滤条件
	 * @return List<User> 记录集
	 */
	List<User> findList(User user);

	/**
	 * 用户名密码查找
	 *
	 * @param username
	 * @param pwd
	 * @return
	 */
	User selectByUsernamePassword(@Param("username") String username, @Param("password") String pwd);
}
