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
@ApiModel(value = "KeyResultDTO", description = "结果描述")
public class KeyResultDTO {

	@ApiModelProperty("结果编号")
	private String id;

	@ApiModelProperty("结果描述")
	private String description;

	@ApiModelProperty("标题")
	private String name;

	@ApiModelProperty(notes = "所在目标", dataType = "ObjectiveDTO")
	private ObjectiveDTO objectiveDTO;

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

	public ObjectiveDTO getObjectiveDTO() {
		return objectiveDTO;
	}

	public void setObjectiveDTO(ObjectiveDTO objectiveDTO) {
		this.objectiveDTO = objectiveDTO;
	}

	public LocalDateTime getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}


}