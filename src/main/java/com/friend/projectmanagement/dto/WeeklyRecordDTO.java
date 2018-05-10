package com.friend.projectmanagement.dto;

import com.friend.projectmanagement.domain.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

/**
 * DTO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
@ApiModel(value = "WeeklyRecord", description = "周报")
public class WeeklyRecordDTO {

	@ApiModelProperty(notes = "周报编号")
	private String id;

	@ApiModelProperty(notes = "周报内容")
	private String content;

	@ApiModelProperty(notes = "創建时间")
	private LocalDateTime createTime;

	@ApiModelProperty(notes = "创建人")
	private User createUser;


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


	public User getCreateUser() {
		return createUser;
	}

	public void setCreateUser(User createUser) {
		this.createUser = createUser;
	}

	public LocalDateTime getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}


}