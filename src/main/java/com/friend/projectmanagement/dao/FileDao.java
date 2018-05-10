package com.friend.projectmanagement.dao;


import java.util.List;

/**
 * DAO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface FileDao<File> {
	/**
	 * 查询所有信息
	 *
	 * @return List<File> 记录集
	 */
	List<File> findAll();

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return File 记录
	 */
	File getById(String id);

	/**
	 * 获取单挑记录
	 *
	 * @param file 过滤信息
	 * @return File 记录
	 */
	File get(File file);

	/**
	 * 添加记录
	 *
	 * @param file 添加信息
	 * @return int 返回值
	 */
	int insert(File file);

	/**
	 * 批量添加
	 *
	 * @param list 添加信息
	 */
	void batchAdd(List<File> fileList);

	/**
	 * 修改记录
	 *
	 * @param file 需要的修改信息
	 * @return int 返回值
	 */
	int update(File file);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return List<File> 记录集
	 */
	List<File> findPage();

	/**
	 * 条件查询
	 *
	 * @param file 过滤条件
	 * @return List<File> 记录集
	 */
	List<File> findList(File file);
}
