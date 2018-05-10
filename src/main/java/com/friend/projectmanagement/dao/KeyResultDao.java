package com.friend.projectmanagement.dao;


import java.util.List;

/**
 * DAO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface KeyResultDao<KeyResult> {
	/**
	 * 查询所有信息
	 *
	 * @return List<KeyResult> 记录集
	 */
	List<KeyResult> findAll();

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return KeyResult 记录
	 */
	KeyResult getById(String id);

	/**
	 * 获取单挑记录
	 *
	 * @param keyResult 过滤信息
	 * @return KeyResult 记录
	 */
	KeyResult get(KeyResult keyResult);

	/**
	 * 添加记录
	 *
	 * @param keyResult 添加信息
	 * @return int 返回值
	 */
	int insert(KeyResult keyResult);

	/**
	 * 批量添加
	 *
	 * @param list 添加信息
	 */
	void batchAdd(List<KeyResult> keyResultList);

	/**
	 * 修改记录
	 *
	 * @param keyResult 需要的修改信息
	 * @return int 返回值
	 */
	int update(KeyResult keyResult);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return List<KeyResult> 记录集
	 */
	List<KeyResult> findPage();

	/**
	 * 条件查询
	 *
	 * @param keyResult 过滤条件
	 * @return List<KeyResult> 记录集
	 */
	List<KeyResult> findList(KeyResult keyResult);
}
