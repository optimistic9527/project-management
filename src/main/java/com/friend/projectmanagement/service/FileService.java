package com.friend.projectmanagement.service;

import com.friend.projectmanagement.dto.FileDTO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Service
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface FileService {
	/**
	 * 查询所有信息
	 *
	 * @return List<File> 记录集
	 */
	List<FileDTO> findAll();

	/**
	 * 查询部分信息
	 *
	 * @param fileDTO 过滤信息
	 * @return List<FileDTO> 记录集
	 */
	List<FileDTO> findList(FileDTO fileDTO);

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return FileDTO 记录
	 */
	FileDTO getById(String id);

	/**
	 * 获取单条记录
	 *
	 * @param fileDTO 过滤信息
	 * @return FileDTO 记录
	 */
	FileDTO get(FileDTO fileDTO);

	/**
	 * 添加记录
	 *
	 * @param fileDTO 添加信息
	 * @return int 返回值
	 */
	int insert(FileDTO fileDTO);

	/**
	 * 修改记录
	 *
	 * @param fileDTO 需要修改信息
	 * @return int 返回值
	 */
	int update(FileDTO fileDTO);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return Page<FileDTO> 分页信息
	 */
	PageInfo<FileDTO> findPage(int pageNum, int pageSize);
}
