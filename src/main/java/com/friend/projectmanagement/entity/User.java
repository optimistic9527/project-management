package com.friend.projectmanagement.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

@ApiModel(value = "User", description = "用户信息描述")
public class User {
    @ApiModelProperty("用户编号")
    private String id;
    @ApiModelProperty("用户名称")
    private String name;
    @ApiModelProperty("团队编号")
    private String teamId;
    @ApiModelProperty("創建时间")
    private LocalDateTime createTime;
    @ApiModelProperty("上次登陆时间")
    private LocalDateTime lastLogin;
    @ApiModelProperty("电话号码")
    private String phone;
    @ApiModelProperty("是否可用")
    private Boolean disabled;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("性别")
    private Boolean gender;
    @ApiModelProperty("邮箱")
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}