package com.friend.projectmanagement.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
@ApiModel(value = "KeyResult", description = "结果描述")
public class KeyResult {
    @ApiModelProperty("结果编号")
    private String id;
    @ApiModelProperty("结果描述")
    private String description;
    @ApiModelProperty("标题")
    private String name;
    @ApiModelProperty("目标编号")
    private String objectiveId;
    private Objective objective;
    @ApiModelProperty("是否可用")
    private Boolean disabled;
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getObjectiveId() {
        return objectiveId;
    }

    public void setObjectiveId(String objectiveId) {
        this.objectiveId = objectiveId == null ? null : objectiveId.trim();
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}