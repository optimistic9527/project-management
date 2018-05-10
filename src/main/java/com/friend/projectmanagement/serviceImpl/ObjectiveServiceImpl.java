package com.friend.projectmanagement.serviceImpl;


import com.friend.projectmanagement.dao.ObjectiveDao;
import com.friend.projectmanagement.domain.Objective;
import com.friend.projectmanagement.dto.ObjectiveDTO;
import com.friend.projectmanagement.service.ObjectiveService;
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
public class ObjectiveServiceImpl implements ObjectiveService {
	@Resource
	private ObjectiveDao<Objective> objectiveDao;

	@Transactional(readOnly = true)
	public List<ObjectiveDTO> findAll() {
		return Collections.unmodifiableList(transformList(objectiveDao.findAll()));
	}

	public List<ObjectiveDTO> findList(ObjectiveDTO objectiveDTO) {
		List<Objective> list = objectiveDao.findList(transformToDomain(objectiveDTO));
		return Collections.unmodifiableList(transformList(list));
	}

	@Transactional(readOnly = true)
	public ObjectiveDTO getById(String id) {
		return transformToDTO(objectiveDao.getById(id));
	}

	@Transactional(readOnly = true)
	public ObjectiveDTO get(ObjectiveDTO objectiveDTO) {
		return transformToDTO(objectiveDao.get(transformToDomain(objectiveDTO)));
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int insert(ObjectiveDTO objectiveDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int update(ObjectiveDTO objectiveDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public void delete(String id) {
		objectiveDao.delete(id);
	}

	@Transactional(readOnly = true)
	public PageInfo<ObjectiveDTO> findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Objective> list = objectiveDao.findPage();
		return new PageInfo<>(transformList(list));
	}


	private List<ObjectiveDTO> transformList(List<Objective> objectiveList) {
		//todo
		return new ArrayList<ObjectiveDTO>();
	}

	private ObjectiveDTO transformToDTO(Objective objective) {
		ObjectiveDTO objectiveDTO = new ObjectiveDTO();
		//todo
		return objectiveDTO;
	}

	private Objective transformToDomain(ObjectiveDTO objectiveDTO) {
		Objective objective = new Objective();
		//todo
		return objective;
	}
}
