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
@ApiModel(value = "Team", description = "团队信息描述")
public class TeamDTO {

	@ApiModelProperty(notes = "团队编号")
	private String id;

	@ApiModelProperty(notes = "創建用户")
	private User createUser;

	@ApiModelProperty(notes = "創建时间")

	private LocalDateTime createTime;

	@ApiModelProperty(notes = "团队名称")
	private String name;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getCreateUser() {
		return createUser;
	}

	public void setCreateUser(User createUser) {
		this.createUser = createUser;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}