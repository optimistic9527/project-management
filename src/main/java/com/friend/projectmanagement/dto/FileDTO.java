package com.friend.projectmanagement.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

/**
 * DTO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
@ApiModel(value = "File", description = "文件信息描述")
public class FileDTO {

	@ApiModelProperty("文件编号")
	private String id;
	@ApiModelProperty("文件路径")
	private String path;
	@ApiModelProperty("文件类型")
	private String type;
	@ApiModelProperty("上传时间")
	private LocalDateTime uploadTime;


	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}


	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public LocalDateTime getUploadTime() {
		return this.uploadTime;
	}

	public void setUploadTime(LocalDateTime uploadTime) {
		this.uploadTime = uploadTime;
	}


}