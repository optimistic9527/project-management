package com.friend.projectmanagement.domain;

import java.time.LocalDateTime;


/**
 * DO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public class File {

	private String id;

	private String path;

	private String type;


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