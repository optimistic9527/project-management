package com.friend.projectmanagement.serviceImpl;


import com.friend.projectmanagement.dao.RoleUserDao;
import com.friend.projectmanagement.domain.RoleUser;
import com.friend.projectmanagement.dto.RoleUserDTO;
import com.friend.projectmanagement.service.RoleUserService;
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
public class RoleUserServiceImpl implements RoleUserService {
	@Resource
	private RoleUserDao<RoleUser> roleUserDao;

	@Transactional(readOnly = true)
	public List<RoleUserDTO> findAll() {
		return Collections.unmodifiableList(transformList(roleUserDao.findAll()));
	}

	public List<RoleUserDTO> findList(RoleUserDTO roleUserDTO) {
		List<RoleUser> list = roleUserDao.findList(transformToDomain(roleUserDTO));
		return Collections.unmodifiableList(transformList(list));
	}

	@Transactional(readOnly = true)
	public RoleUserDTO getById(String id) {
		return transformToDTO(roleUserDao.getById(id));
	}

	@Transactional(readOnly = true)
	public RoleUserDTO get(RoleUserDTO roleUserDTO) {
		return transformToDTO(roleUserDao.get(transformToDomain(roleUserDTO)));
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int insert(RoleUserDTO roleUserDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int update(RoleUserDTO roleUserDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public void delete(String id) {
		roleUserDao.delete(id);
	}

	@Transactional(readOnly = true)
	public PageInfo<RoleUserDTO> findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<RoleUser> list = roleUserDao.findPage();
		return new PageInfo<>(transformList(list));
	}


	private List<RoleUserDTO> transformList(List<RoleUser> roleUserList) {
		//todo
		return new ArrayList<RoleUserDTO>();
	}

	private RoleUserDTO transformToDTO(RoleUser roleUser) {
		RoleUserDTO roleUserDTO = new RoleUserDTO();
		//todo
		return roleUserDTO;
	}

	private RoleUser transformToDomain(RoleUserDTO roleUserDTO) {
		RoleUser roleUser = new RoleUser();
		//todo
		return roleUser;
	}
}
