package com.friend.projectmanagement.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
@ApiModel(value = "Project", description = "项目信息描述")
public class Project {
    @ApiModelProperty("项目编号")
    private String id;
    @ApiModelProperty("项目名称")
    private String name;
    @ApiModelProperty("是否可用")
    private Boolean disabled;
    @ApiModelProperty("团队编号")
    private String teamId;
    private Team team;
    @ApiModelProperty("预期结束时间")
    private LocalDateTime dueTime;
    @ApiModelProperty("实际结束时间")
    private LocalDateTime endTime;
    @ApiModelProperty("創建时间")
    private LocalDateTime createTime;
    @ApiModelProperty("项目描述")
    private String description;
    @ApiModelProperty("项目状态")
    private Byte status;

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

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    public LocalDateTime getDueTime() {
        return dueTime;
    }

    public void setDueTime(LocalDateTime dueTime) {
        this.dueTime = dueTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}