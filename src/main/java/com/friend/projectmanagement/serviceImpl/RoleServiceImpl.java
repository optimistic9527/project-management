package com.friend.projectmanagement.serviceImpl;


import com.friend.projectmanagement.dao.RoleDao;
import com.friend.projectmanagement.domain.Role;
import com.friend.projectmanagement.dto.RoleDTO;
import com.friend.projectmanagement.service.RoleService;
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
public class RoleServiceImpl implements RoleService {
	@Resource
	private RoleDao<Role> roleDao;

	@Transactional(readOnly = true)
	public List<RoleDTO> findAll() {
		return Collections.unmodifiableList(transformList(roleDao.findAll()));
	}

	public List<RoleDTO> findList(RoleDTO roleDTO) {
		List<Role> list = roleDao.findList(transformToDomain(roleDTO));
		return Collections.unmodifiableList(transformList(list));
	}

	@Transactional(readOnly = true)
	public RoleDTO getById(String id) {
		return transformToDTO(roleDao.getById(id));
	}

	@Transactional(readOnly = true)
	public RoleDTO get(RoleDTO roleDTO) {
		return transformToDTO(roleDao.get(transformToDomain(roleDTO)));
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int insert(RoleDTO roleDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int update(RoleDTO roleDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public void delete(String id) {
		roleDao.delete(id);
	}

	@Transactional(readOnly = true)
	public PageInfo<RoleDTO> findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Role> list = roleDao.findPage();
		return new PageInfo<>(transformList(list));
	}


	private List<RoleDTO> transformList(List<Role> roleList) {
		//todo
		return new ArrayList<RoleDTO>();
	}

	private RoleDTO transformToDTO(Role role) {
		RoleDTO roleDTO = new RoleDTO();
		//todo
		return roleDTO;
	}

	private Role transformToDomain(RoleDTO roleDTO) {
		Role role = new Role();
		//todo
		return role;
	}
}
