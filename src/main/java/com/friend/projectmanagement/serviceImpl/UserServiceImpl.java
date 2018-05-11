package com.friend.projectmanagement.serviceImpl;


import com.friend.projectmanagement.dao.UserDao;
import com.friend.projectmanagement.domain.User;
import com.friend.projectmanagement.dto.TeamDTO;
import com.friend.projectmanagement.dto.UserDTO;
import com.friend.projectmanagement.service.TeamService;
import com.friend.projectmanagement.service.UserService;
import com.friend.projectmanagement.util.SnowFlakeIdGenerator;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
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
	@Resource
	private TeamService TeamService;

	@Transactional(readOnly = true)
	public List<UserDTO> findAll() {
		return Collections.unmodifiableList(transformUserList(userDao.findAll()));
	}

	public List<UserDTO> findList(UserDTO userDTO) {
		List<User> list = userDao.findList(transformToDomain(userDTO, false));
		return Collections.unmodifiableList(transformUserList(list));
	}

	@Transactional(readOnly = true)
	public UserDTO getById(String id) {
		return transformToDTO(userDao.getById(id), true);
	}

	@Transactional(readOnly = true)
	public UserDTO get(UserDTO userDTO) {
		return transformToDTO(userDao.get(transformToDomain(userDTO, false)), true);
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int insert(UserDTO userDTO) {
		if (userDTO == null) {
			return 0;
		}
		userDao.insert(transformToDomain(userDTO, true));
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
		return new PageInfo<>(transformUserList(list));
	}

	@Override
	@Transactional(readOnly = true)
	public UserDTO findUserByUsernamePassword(String username, String pwd) {
		User user = userDao.selectByUsernamePassword(username, pwd);
		return transformToDTO(user, true);
	}


	private List<UserDTO> transformUserList(List<User> userList) {
		final ArrayList<UserDTO> userDTOList = new ArrayList<>(userList.size());
		userList.forEach(user -> userDTOList.add(transformToDTO(user, true)));
		return userDTOList;
	}

	private UserDTO transformToDTO(User user, boolean isSelectDetail) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setName(user.getName());
		userDTO.setCreateTime(user.getCreateTime());
		userDTO.setLastLogin(user.getLastLogin());
		userDTO.setEmail(user.getEmail());
		userDTO.setGender(user.getGender());
		userDTO.setPhone(user.getPhone());
		String teamId = user.getTeamId();
		if (teamId != null) {
			TeamDTO teamDTO = new TeamDTO();
			teamDTO.setId(teamId);
			userDTO.setTeamDTO(teamDTO);
			if (isSelectDetail) {
				TeamDTO teamDTOById = TeamService.getById(teamId);
				userDTO.setTeamDTO(teamDTOById);
			}
		}
		return userDTO;
	}

	private User transformToDomain(UserDTO userDTO, boolean isCreate) {
		User user = new User();
		if (isCreate) {
			user.setDisabled((byte) 0);
			user.setCreateTime(LocalDateTime.now());
		}
		user.setEmail(userDTO.getEmail());
		user.setGender(userDTO.getGender());
		user.setId(SnowFlakeIdGenerator.CreateId());
		user.setName(userDTO.getName());
		user.setPassword(userDTO.getPassword());
		user.setPhone(userDTO.getPhone());
		return user;
	}
}
