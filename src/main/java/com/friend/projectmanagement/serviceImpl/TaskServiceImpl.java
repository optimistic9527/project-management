package com.friend.projectmanagement.serviceImpl;


import com.friend.projectmanagement.dao.TaskDao;
import com.friend.projectmanagement.domain.Task;
import com.friend.projectmanagement.dto.TaskDTO;
import com.friend.projectmanagement.service.TaskService;
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
public class TaskServiceImpl implements TaskService {
	@Resource
	private TaskDao<Task> taskDao;

	@Transactional(readOnly = true)
	public List<TaskDTO> findAll() {
		return Collections.unmodifiableList(transformList(taskDao.findAll()));
	}

	public List<TaskDTO> findList(TaskDTO taskDTO) {
		List<Task> list = taskDao.findList(transformToDomain(taskDTO));
		return Collections.unmodifiableList(transformList(list));
	}

	@Transactional(readOnly = true)
	public TaskDTO getById(String id) {
		return transformToDTO(taskDao.getById(id));
	}

	@Transactional(readOnly = true)
	public TaskDTO get(TaskDTO taskDTO) {
		return transformToDTO(taskDao.get(transformToDomain(taskDTO)));
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int insert(TaskDTO taskDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int update(TaskDTO taskDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public void delete(String id) {
		taskDao.delete(id);
	}

	@Transactional(readOnly = true)
	public PageInfo<TaskDTO> findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Task> list = taskDao.findPage();
		return new PageInfo<>(transformList(list));
	}


	private List<TaskDTO> transformList(List<Task> taskList) {
		//todo
		return new ArrayList<TaskDTO>();
	}

	private TaskDTO transformToDTO(Task task) {
		TaskDTO taskDTO = new TaskDTO();
		//todo
		return taskDTO;
	}

	private Task transformToDomain(TaskDTO taskDTO) {
		Task task = new Task();
		//todo
		return task;
	}
}
