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
@ApiModel(value = "DailyRecordDTO", description = "日报详情")
public class DailyRecordDTO {

	@ApiModelProperty("日报编号")
	private String id;

	@ApiModelProperty("日报内容")
	private String content;

	@ApiModelProperty(notes = "創建时间")
	private LocalDateTime createTime;

	@ApiModelProperty(notes = "创建人", dataType = "UserDTO")
	private UserDTO createUserDTO;

	@ApiModelProperty(notes = "日报所在任务", dataType = "TaskDTO")
	private TaskDTO taskDTO;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public UserDTO getCreateUserDTO() {
		return createUserDTO;
	}

	public void setCreateUserDTO(UserDTO createUserDTO) {
		this.createUserDTO = createUserDTO;
	}

	public TaskDTO getTaskDTO() {
		return taskDTO;
	}

	public void setTaskDTO(TaskDTO taskDTO) {
		this.taskDTO = taskDTO;
	}
}