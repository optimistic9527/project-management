package com.friend.projectmanagement.service;

import com.friend.projectmanagement.dto.TeamDTO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Service
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface TeamService {
	/**
	 * 查询所有信息
	 *
	 * @return List<Team> 记录集
	 */
	List<TeamDTO> findAll();

	/**
	 * 查询部分信息
	 *
	 * @param teamDTO 过滤信息
	 * @return List<TeamDTO> 记录集
	 */
	List<TeamDTO> findList(TeamDTO teamDTO);

	/**
	 * 主键获取记录
	 *
	 * @param id 主键
	 * @return TeamDTO 记录
	 */
	TeamDTO getById(String id);

	/**
	 * 获取单条记录
	 *
	 * @param teamDTO 过滤信息
	 * @return TeamDTO 记录
	 */
	TeamDTO get(TeamDTO teamDTO);

	/**
	 * 添加记录
	 *
	 * @param teamDTO 添加信息
	 * @return int 返回值
	 */
	int insert(TeamDTO teamDTO);

	/**
	 * 修改记录
	 *
	 * @param teamDTO 需要修改信息
	 * @return int 返回值
	 */
	int update(TeamDTO teamDTO);

	/**
	 * 删除记录
	 *
	 * @param id 主键ID
	 */
	void delete(String id);

	/**
	 * 分页查询
	 *
	 * @return Page<TeamDTO> 分页信息
	 */
	PageInfo<TeamDTO> findPage(int pageNum, int pageSize);
}
