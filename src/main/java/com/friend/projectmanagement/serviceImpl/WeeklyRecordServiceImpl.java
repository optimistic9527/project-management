package com.friend.projectmanagement.serviceImpl;


import com.friend.projectmanagement.dao.WeeklyRecordDao;
import com.friend.projectmanagement.domain.WeeklyRecord;
import com.friend.projectmanagement.dto.WeeklyRecordDTO;
import com.friend.projectmanagement.service.WeeklyRecordService;
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
public class WeeklyRecordServiceImpl implements WeeklyRecordService {
	@Resource
	private WeeklyRecordDao<WeeklyRecord> weeklyRecordDao;

	@Transactional(readOnly = true)
	public List<WeeklyRecordDTO> findAll() {
		return Collections.unmodifiableList(transformList(weeklyRecordDao.findAll()));
	}

	public List<WeeklyRecordDTO> findList(WeeklyRecordDTO weeklyRecordDTO) {
		List<WeeklyRecord> list = weeklyRecordDao.findList(transformToDomain(weeklyRecordDTO));
		return Collections.unmodifiableList(transformList(list));
	}

	@Transactional(readOnly = true)
	public WeeklyRecordDTO getById(String id) {
		return transformToDTO(weeklyRecordDao.getById(id));
	}

	@Transactional(readOnly = true)
	public WeeklyRecordDTO get(WeeklyRecordDTO weeklyRecordDTO) {
		return transformToDTO(weeklyRecordDao.get(transformToDomain(weeklyRecordDTO)));
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int insert(WeeklyRecordDTO weeklyRecordDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int update(WeeklyRecordDTO weeklyRecordDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public void delete(String id) {
		weeklyRecordDao.delete(id);
	}

	@Transactional(readOnly = true)
	public PageInfo<WeeklyRecordDTO> findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<WeeklyRecord> list = weeklyRecordDao.findPage();
		return new PageInfo<>(transformList(list));
	}


	private List<WeeklyRecordDTO> transformList(List<WeeklyRecord> weeklyRecordList) {
		//todo
		return new ArrayList<WeeklyRecordDTO>();
	}

	private WeeklyRecordDTO transformToDTO(WeeklyRecord weeklyRecord) {
		WeeklyRecordDTO weeklyRecordDTO = new WeeklyRecordDTO();
		//todo
		return weeklyRecordDTO;
	}

	private WeeklyRecord transformToDomain(WeeklyRecordDTO weeklyRecordDTO) {
		WeeklyRecord weeklyRecord = new WeeklyRecord();
		//todo
		return weeklyRecord;
	}
}
