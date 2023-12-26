package com.web.info.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class TaskDto extends BaseDto<String> {
	private String pkTitle;
	private TaskDto task;
	private Integer maxXp;
}
