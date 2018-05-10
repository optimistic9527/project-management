package com.friend.projectmanagement.serviceImpl;


import com.friend.projectmanagement.dao.DailyRecordDao;
import com.friend.projectmanagement.domain.DailyRecord;
import com.friend.projectmanagement.dto.DailyRecordDTO;
import com.friend.projectmanagement.service.DailyRecordService;
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
public class DailyRecordServiceImpl implements DailyRecordService {
	@Resource
	private DailyRecordDao<DailyRecord> dailyRecordDao;

	@Transactional(readOnly = true)
	public List<DailyRecordDTO> findAll() {
		return Collections.unmodifiableList(transformList(dailyRecordDao.findAll()));
	}

	public List<DailyRecordDTO> findList(DailyRecordDTO dailyRecordDTO) {
		List<DailyRecord> list = dailyRecordDao.findList(transformToDomain(dailyRecordDTO));
		return Collections.unmodifiableList(transformList(list));
	}

	@Transactional(readOnly = true)
	public DailyRecordDTO getById(String id) {
		return transformToDTO(dailyRecordDao.getById(id));
	}

	@Transactional(readOnly = true)
	public DailyRecordDTO get(DailyRecordDTO dailyRecordDTO) {
		return transformToDTO(dailyRecordDao.get(transformToDomain(dailyRecordDTO)));
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int insert(DailyRecordDTO dailyRecordDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int update(DailyRecordDTO dailyRecordDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public void delete(String id) {
		dailyRecordDao.delete(id);
	}

	@Transactional(readOnly = true)
	public PageInfo<DailyRecordDTO> findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<DailyRecord> list = dailyRecordDao.findPage();
		return new PageInfo<>(transformList(list));
	}


	private List<DailyRecordDTO> transformList(List<DailyRecord> dailyRecordList) {
		//todo
		return new ArrayList<DailyRecordDTO>();
	}

	private DailyRecordDTO transformToDTO(DailyRecord dailyRecord) {
		DailyRecordDTO dailyRecordDTO = new DailyRecordDTO();
		//todo
		return dailyRecordDTO;
	}

	private DailyRecord transformToDomain(DailyRecordDTO dailyRecordDTO) {
		DailyRecord dailyRecord = new DailyRecord();
		//todo
		return dailyRecord;
	}
}
