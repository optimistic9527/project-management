package com.friend.projectmanagement.serviceImpl;


import com.friend.projectmanagement.dao.TeamDao;
import com.friend.projectmanagement.domain.Team;
import com.friend.projectmanagement.dto.TeamDTO;
import com.friend.projectmanagement.service.TeamService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Service
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
@Service
public class TeamServiceImpl implements TeamService {
	@Resource
	private TeamDao<Team> teamDao;

	@Transactional(readOnly = true)
	public List<TeamDTO> findAll() {
		return Collections.unmodifiableList(transformList(teamDao.findAll()));
	}

	public List<TeamDTO> findList(TeamDTO teamDTO) {
		List<Team> list = teamDao.findList(transformToDomain(teamDTO));
		return Collections.unmodifiableList(transformList(list));
	}

	@Transactional(readOnly = true)
	public TeamDTO getById(String id) {
		return transformToDTO(teamDao.getById(id));
	}

	@Transactional(readOnly = true)
	public TeamDTO get(TeamDTO teamDTO) {
		return transformToDTO(teamDao.get(transformToDomain(teamDTO)));
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int insert(TeamDTO teamDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int update(TeamDTO teamDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public void delete(String id) {
		teamDao.delete(id);
	}

	@Transactional(readOnly = true)
	public PageInfo<TeamDTO> findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Team> list = teamDao.findPage();
		return new PageInfo<>(transformList(list));
	}


	private List<TeamDTO> transformList(List<Team> teamList) {
		//todo
		return new ArrayList<TeamDTO>();
	}

	private TeamDTO transformToDTO(Team team) {
		TeamDTO teamDTO = new TeamDTO();
		//todo
		return teamDTO;
	}

	private Team transformToDomain(TeamDTO teamDTO) {
		Team team = new Team();
		//todo
		return team;
	}
}
