package com.friend.projectmanagement.dto;

import com.friend.projectmanagement.domain.Team;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

/**
 * DTO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
@ApiModel(value = "Project", description = "项目信息描述")
public class ProjectDTO {

	@ApiModelProperty(notes = "项目编号")
	private String id;

	@ApiModelProperty(notes = "项目名称")
	private String name;

	@ApiModelProperty(notes = "所在团队")
	private Team team;

	@ApiModelProperty(notes = "预期结束时间")
	private LocalDateTime dueTime;

	@ApiModelProperty(notes = "实际结束时间")
	private LocalDateTime endTime;

	@ApiModelProperty(notes = "創建时间")
	private LocalDateTime createTime;

	@ApiModelProperty(notes = "项目描述")
	private String description;

	@ApiModelProperty(notes = "项目状态")
	private Byte status;


	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public LocalDateTime getDueTime() {
		return this.dueTime;
	}

	public void setDueTime(LocalDateTime dueTime) {
		this.dueTime = dueTime;
	}


	public LocalDateTime getEndTime() {
		return this.endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}


	public LocalDateTime getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}


}