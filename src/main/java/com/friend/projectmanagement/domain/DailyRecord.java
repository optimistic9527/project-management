package com.friend.projectmanagement.domain;

import java.time.LocalDateTime;


/**
 * DO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public class DailyRecord {

	private String id;

	private String content;

	private Byte disabled;

	private LocalDateTime createTime;

	private String createId;

	private String taskId;


	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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


	public String getCreateId() {
		return this.createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}


	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}


}