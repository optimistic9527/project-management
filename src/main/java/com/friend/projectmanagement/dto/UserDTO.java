package com.friend.projectmanagement.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

/**
 * DTO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
@ApiModel(value = "UserDTO", description = "用户信息描述")
public class UserDTO {

	@ApiModelProperty(notes = "用户编号")
	private String id;

	@ApiModelProperty(notes = "用户名称")
	private String name;

	@ApiModelProperty(notes = "所属团队", dataType = "TeamDTO")
	private TeamDTO teamDTO;

	@ApiModelProperty(notes = "創建时间")

	private LocalDateTime createTime;

	@ApiModelProperty(notes = "上次登陆时间")

	private LocalDateTime lastLogin;

	@ApiModelProperty(notes = "电话号码")
	private String phone;

	@ApiModelProperty(notes = "密码")
	private String password;

	@ApiModelProperty(notes = "性别")
	private Byte gender;

	@ApiModelProperty(notes = "邮箱")
	private String email;


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

	public LocalDateTime getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}


	public LocalDateTime getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}


	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public TeamDTO getTeamDTO() {
		return teamDTO;
	}

	public void setTeamDTO(TeamDTO teamDTO) {
		this.teamDTO = teamDTO;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Byte getGender() {
		return this.gender;
	}

	public void setGender(Byte gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}