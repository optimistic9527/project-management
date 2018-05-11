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
@ApiModel(value = "TaskDTO", description = "用户任务描述")
public class TaskDTO {

	@ApiModelProperty(notes = "任务编号")
	private String id;

	@ApiModelProperty(notes = "任务标题")
	private String title;

	@ApiModelProperty(notes = "任务内容")
	private String content;

	@ApiModelProperty(notes = "预期结束时间")
	private LocalDateTime dueTime;

	@ApiModelProperty(notes = "实际结束时间")
	private LocalDateTime endTime;

	@ApiModelProperty(notes = "創建时间")
	private LocalDateTime createTime;

	@ApiModelProperty(notes = "任务状态")
	private Byte status;

	@ApiModelProperty(notes = "创建人", dataType = "UserDTO")
	private UserDTO createUserDTO;

	@ApiModelProperty(notes = "分配人", dataType = "UserDTO")
	private UserDTO assigneeUserDTO;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getDueTime() {
		return dueTime;
	}

	public void setDueTime(LocalDateTime dueTime) {
		this.dueTime = dueTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public UserDTO getCreateUserDTO() {
		return createUserDTO;
	}

	public void setCreateUserDTO(UserDTO createUserDTO) {
		this.createUserDTO = createUserDTO;
	}

	public UserDTO getAssigneeUserDTO() {
		return assigneeUserDTO;
	}

	public void setAssigneeUserDTO(UserDTO assigneeUserDTO) {
		this.assigneeUserDTO = assigneeUserDTO;
	}
}