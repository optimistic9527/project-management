package com.friend.projectmanagement.domain;

import java.time.LocalDateTime;


/**
 * DO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public class Objective {

	private String id;

	private String description;

	private String name;

	private String projectId;

	private Byte disabled;


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


	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public Byte getDisabled() {
		return this.disabled;
	}

	public void setDisabled(Byte disabled) {
		this.disabled = disabled;
	}


	public LocalDateTime getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}


}