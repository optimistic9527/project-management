package com.friend.projectmanagement.domain;

import java.time.LocalDateTime;


/**
 * DO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public class Project {

	private String id;

	private String name;

	private Byte disabled;

	private String teamId;


	private LocalDateTime dueTime;


	private LocalDateTime endTime;


	private LocalDateTime createTime;

	private String description;

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

	public Byte getDisabled() {
		return this.disabled;
	}

	public void setDisabled(Byte disabled) {
		this.disabled = disabled;
	}


	public String getTeamId() {
		return this.teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
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