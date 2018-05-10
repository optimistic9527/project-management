package com.friend.projectmanagement.dto;

import com.friend.projectmanagement.domain.Role;
import com.friend.projectmanagement.domain.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DTO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
@ApiModel(value = "RoleUser", description = "用户角色关系描述")
public class RoleUserDTO {

	@ApiModelProperty(notes = "角色")
	private Role role;

	@ApiModelProperty(notes = "用户")
	private User user;


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {

		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}