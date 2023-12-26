package com.web.info.mapper;

import com.web.info.model.dto.TaskDto;
import com.web.info.model.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TaskMapper extends BaseMapper<Task, TaskDto> {
	TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);
}
