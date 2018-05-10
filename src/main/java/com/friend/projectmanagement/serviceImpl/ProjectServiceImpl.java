package com.friend.projectmanagement.serviceImpl;


import com.friend.projectmanagement.dao.ProjectDao;
import com.friend.projectmanagement.domain.Project;
import com.friend.projectmanagement.dto.ProjectDTO;
import com.friend.projectmanagement.service.ProjectService;
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
public class ProjectServiceImpl implements ProjectService {
	@Resource
	private ProjectDao<Project> projectDao;

	@Transactional(readOnly = true)
	public List<ProjectDTO> findAll() {
		return Collections.unmodifiableList(transformList(projectDao.findAll()));
	}

	public List<ProjectDTO> findList(ProjectDTO projectDTO) {
		List<Project> list = projectDao.findList(transformToDomain(projectDTO));
		return Collections.unmodifiableList(transformList(list));
	}

	@Transactional(readOnly = true)
	public ProjectDTO getById(String id) {
		return transformToDTO(projectDao.getById(id));
	}

	@Transactional(readOnly = true)
	public ProjectDTO get(ProjectDTO projectDTO) {
		return transformToDTO(projectDao.get(transformToDomain(projectDTO)));
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int insert(ProjectDTO projectDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int update(ProjectDTO projectDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public void delete(String id) {
		projectDao.delete(id);
	}

	@Transactional(readOnly = true)
	public PageInfo<ProjectDTO> findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Project> list = projectDao.findPage();
		return new PageInfo<>(transformList(list));
	}


	private List<ProjectDTO> transformList(List<Project> projectList) {
		//todo
		return new ArrayList<ProjectDTO>();
	}

	private ProjectDTO transformToDTO(Project project) {
		ProjectDTO projectDTO = new ProjectDTO();
		//todo
		return projectDTO;
	}

	private Project transformToDomain(ProjectDTO projectDTO) {
		Project project = new Project();
		//todo
		return project;
	}
}
