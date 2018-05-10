package com.friend.projectmanagement.serviceImpl;


import com.friend.projectmanagement.dao.KeyResultDao;
import com.friend.projectmanagement.domain.KeyResult;
import com.friend.projectmanagement.dto.KeyResultDTO;
import com.friend.projectmanagement.service.KeyResultService;
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
public class KeyResultServiceImpl implements KeyResultService {
	@Resource
	private KeyResultDao<KeyResult> keyResultDao;

	@Transactional(readOnly = true)
	public List<KeyResultDTO> findAll() {
		return Collections.unmodifiableList(transformList(keyResultDao.findAll()));
	}

	public List<KeyResultDTO> findList(KeyResultDTO keyResultDTO) {
		List<KeyResult> list = keyResultDao.findList(transformToDomain(keyResultDTO));
		return Collections.unmodifiableList(transformList(list));
	}

	@Transactional(readOnly = true)
	public KeyResultDTO getById(String id) {
		return transformToDTO(keyResultDao.getById(id));
	}

	@Transactional(readOnly = true)
	public KeyResultDTO get(KeyResultDTO keyResultDTO) {
		return transformToDTO(keyResultDao.get(transformToDomain(keyResultDTO)));
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int insert(KeyResultDTO keyResultDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int update(KeyResultDTO keyResultDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public void delete(String id) {
		keyResultDao.delete(id);
	}

	@Transactional(readOnly = true)
	public PageInfo<KeyResultDTO> findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<KeyResult> list = keyResultDao.findPage();
		return new PageInfo<>(transformList(list));
	}


	private List<KeyResultDTO> transformList(List<KeyResult> keyResultList) {
		//todo
		return new ArrayList<KeyResultDTO>();
	}

	private KeyResultDTO transformToDTO(KeyResult keyResult) {
		KeyResultDTO keyResultDTO = new KeyResultDTO();
		//todo
		return keyResultDTO;
	}

	private KeyResult transformToDomain(KeyResultDTO keyResultDTO) {
		KeyResult keyResult = new KeyResult();
		//todo
		return keyResult;
	}
}
