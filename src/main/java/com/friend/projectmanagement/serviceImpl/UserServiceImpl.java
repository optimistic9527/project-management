package com.friend.projectmanagement.serviceImpl;


import com.friend.projectmanagement.dao.UserDao;
import com.friend.projectmanagement.domain.User;
import com.friend.projectmanagement.dto.UserDTO;
import com.friend.projectmanagement.service.UserService;
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
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao<User> userDao;

	@Transactional(readOnly = true)
	public List<UserDTO> findAll() {
		return Collections.unmodifiableList(transformList(userDao.findAll()));
	}

	public List<UserDTO> findList(UserDTO userDTO) {
		List<User> list = userDao.findList(transformToDomain(userDTO));
		return Collections.unmodifiableList(transformList(list));
	}

	@Transactional(readOnly = true)
	public UserDTO getById(String id) {
		return transformToDTO(userDao.getById(id));
	}

	@Transactional(readOnly = true)
	public UserDTO get(UserDTO userDTO) {
		return transformToDTO(userDao.get(transformToDomain(userDTO)));
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int insert(UserDTO userDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int update(UserDTO userDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public void delete(String id) {
		userDao.delete(id);
	}

	@Transactional(readOnly = true)
	public PageInfo<UserDTO> findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<User> list = userDao.findPage();
		return new PageInfo<>(transformList(list));
	}


	private List<UserDTO> transformList(List<User> userList) {
		//todo
		return new ArrayList<UserDTO>();
	}

	private UserDTO transformToDTO(User user) {
		UserDTO userDTO = new UserDTO();
		//todo
		return userDTO;
	}

	private User transformToDomain(UserDTO userDTO) {
		User user = new User();
		//todo
		return user;
	}
}
