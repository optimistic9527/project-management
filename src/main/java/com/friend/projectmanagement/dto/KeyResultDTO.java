package com.friend.projectmanagement.dto;

import com.friend.projectmanagement.domain.Objective;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

/**
 * DTO
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
@ApiModel(value = "KeyResult", description = "结果描述")
public class KeyResultDTO {

	@ApiModelProperty("结果编号")
	private String id;

	@ApiModelProperty("结果描述")
	private String description;

	@ApiModelProperty("标题")
	private String name;

	@ApiModelProperty(notes = "所在目标")
	private Objective objective;

	@ApiModelProperty(notes = "创建时间")
	private LocalDateTime createTime;


	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Objective getObjective() {
		return objective;
	}

	public void setObjective(Objective objective) {
		this.objective = objective;
	}

	public LocalDateTime getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}


}