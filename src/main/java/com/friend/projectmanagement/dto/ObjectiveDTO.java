package com.friend.projectmanagement.dto;

import com.friend.projectmanagement.domain.Project;
import com.friend.projectmanagement.domain.Project;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

/**
 * DTO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
@ApiModel(value = "Objective", description = "目标描述")
public class ObjectiveDTO {

	@ApiModelProperty(notes = "目标编号")
	private String id;

	@ApiModelProperty(notes = "目标描述")
	private String description;

	@ApiModelProperty(notes = "标题")
	private String name;

	@ApiModelProperty(notes = "所属项目")
	private Project project;

	@ApiModelProperty(notes = "創建时间")
	private LocalDateTime createTime;


	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public LocalDateTime getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}


}