package com.friend.projectmanagement.service;

import com.friend.projectmanagement.dto.KeyResultDTO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Service
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface KeyResultService {
	/**
	 * 查询所有信息
	 *
	 * @return List<KeyResult> 记录集
	 */
	List<KeyResultDTO> findAll();

	/**
	 * 查询部分信息
	 *
	 * @param keyResultDTO 过滤信息
	 * @return List<KeyResultDTO> 记录集
	 */
	List<KeyResultDTO> findList(KeyResultDTO keyResultDTO);

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return KeyResultDTO 记录
	 */
	KeyResultDTO getById(String id);

	/**
	 * 获取单条记录
	 *
	 * @param keyResultDTO 过滤信息
	 * @return KeyResultDTO 记录
	 */
	KeyResultDTO get(KeyResultDTO keyResultDTO);

	/**
	 * 添加记录
	 *
	 * @param keyResultDTO 添加信息
	 * @return int 返回值
	 */
	int insert(KeyResultDTO keyResultDTO);

	/**
	 * 修改记录
	 *
	 * @param keyResultDTO 需要修改信息
	 * @return int 返回值
	 */
	int update(KeyResultDTO keyResultDTO);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return Page<KeyResultDTO> 分页信息
	 */
	PageInfo<KeyResultDTO> findPage(int pageNum, int pageSize);
}
