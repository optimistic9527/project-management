package com.friend.projectmanagement.serviceImpl;


import com.friend.projectmanagement.dao.UserDao;
import com.friend.projectmanagement.domain.User;
import com.friend.projectmanagement.dto.TeamDTO;
import com.friend.projectmanagement.dto.UserDTO;
import com.friend.projectmanagement.service.TeamService;
import com.friend.projectmanagement.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
	@Resource
	private TeamService TeamService;
	@Resource
	private DozerBeanMapper dozerBeanMapper;

	@Transactional(readOnly = true)
	public List<UserDTO> findAll() {
		//todo
		return null;
	}

	public List<UserDTO> findList(UserDTO userDTO) {
		User user = dozerBeanMapper.map(userDTO, User.class);
		Optional.ofNullable(userDTO.getTeamDTO()).ifPresent(teamDTO -> Optional.ofNullable(teamDTO.getId()).ifPresent(user::setId));
		List<User> list = userDao.findList(user);
		//todo
		return null;
	}

	@Transactional(readOnly = true)
	public UserDTO getById(String id) {
		User user = userDao.getById(id);
		if (user == null) {
			return null;
		}
		UserDTO userDTO = dozerBeanMapper.map(user, UserDTO.class);
		Optional.ofNullable(user.getTeamId()).ifPresent(teamId -> setTeamDTO(userDTO, teamId));
		return userDTO;
	}

	@Transactional(readOnly = true)
	public UserDTO get(UserDTO userDTO) {
		User user = dozerBeanMapper.map(userDTO, User.class);
		User newUser = userDao.get(user);
		if (newUser == null) {
			return null;
		}
		UserDTO result = new UserDTO();
		Optional.ofNullable(newUser.getTeamId()).ifPresent(teamId -> setTeamDTO(result, teamId));
		return result;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int insert(UserDTO userDTO) {
		if (userDTO == null) {
			return 0;
		}
		User user = dozerBeanMapper.map(userDTO, User.class);
		user.setDisabled((byte) 0);
		user.setCreateTime(LocalDateTime.now());
		return userDao.insert(user);
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
		//todo
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public UserDTO findUserByUsernamePassword(String username, String pwd) {
		User user = userDao.selectByUsernamePassword(username, pwd);
		if (user == null) {
			return null;
		}
		UserDTO userDTO = dozerBeanMapper.map(user, UserDTO.class);
		String teamId = user.getTeamId();
		Optional.ofNullable(teamId).ifPresent(id -> setTeamDTO(userDTO, id));
		return userDTO;
	}

	private void setTeamDTO(UserDTO userDTO, String teamId) {
		TeamDTO teamDTOById = TeamService.getById(teamId);
		userDTO.setTeamDTO(teamDTOById);
	}
}
