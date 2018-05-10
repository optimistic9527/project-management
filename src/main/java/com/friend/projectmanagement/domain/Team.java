package com.friend.projectmanagement.domain;

import java.time.LocalDateTime;


/**
 * DO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public class Team {

	private String id;

	private String createId;

	private Byte disabled;


	private LocalDateTime createTime;

	private String name;


	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getCreateId() {
		return this.createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
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


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}