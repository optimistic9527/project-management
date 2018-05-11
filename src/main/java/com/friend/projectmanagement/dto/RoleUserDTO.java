package com.friend.projectmanagement.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DTO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
@ApiModel(value = "RoleUserDTO", description = "用户角色关系描述")
public class RoleUserDTO {

	@ApiModelProperty(notes = "角色", dataType = "RoleDTO")
	private RoleDTO roleDTO;

	@ApiModelProperty(notes = "用户", dataType = "UserDTO")
	private UserDTO userDTO;

	public RoleDTO getRoleDTO() {
		return roleDTO;
	}

	public void setRoleDTO(RoleDTO roleDTO) {
		this.roleDTO = roleDTO;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
}