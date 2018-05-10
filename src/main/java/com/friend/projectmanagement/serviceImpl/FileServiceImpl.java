package com.friend.projectmanagement.serviceImpl;


import com.friend.projectmanagement.dao.FileDao;
import com.friend.projectmanagement.domain.File;
import com.friend.projectmanagement.dto.FileDTO;
import com.friend.projectmanagement.service.FileService;
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
public class FileServiceImpl implements FileService {
	@Resource
	private FileDao<File> fileDao;

	@Transactional(readOnly = true)
	public List<FileDTO> findAll() {
		return Collections.unmodifiableList(transformList(fileDao.findAll()));
	}

	public List<FileDTO> findList(FileDTO fileDTO) {
		List<File> list = fileDao.findList(transformToDomain(fileDTO));
		return Collections.unmodifiableList(transformList(list));
	}

	@Transactional(readOnly = true)
	public FileDTO getById(String id) {
		return transformToDTO(fileDao.getById(id));
	}

	@Transactional(readOnly = true)
	public FileDTO get(FileDTO fileDTO) {
		return transformToDTO(fileDao.get(transformToDomain(fileDTO)));
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int insert(FileDTO fileDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public int update(FileDTO fileDTO) {
		//todo
		return 1;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
	public void delete(String id) {
		fileDao.delete(id);
	}

	@Transactional(readOnly = true)
	public PageInfo<FileDTO> findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<File> list = fileDao.findPage();
		return new PageInfo<>(transformList(list));
	}


	private List<FileDTO> transformList(List<File> fileList) {
		//todo
		return new ArrayList<FileDTO>();
	}

	private FileDTO transformToDTO(File file) {
		FileDTO fileDTO = new FileDTO();
		//todo
		return fileDTO;
	}

	private File transformToDomain(FileDTO fileDTO) {
		File file = new File();
		//todo
		return file;
	}
}
