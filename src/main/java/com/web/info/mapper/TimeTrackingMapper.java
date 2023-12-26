package com.web.info.mapper;

import com.web.info.model.dto.TimeTrackingDto;
import com.web.info.model.entity.TimeTracking;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TimeTrackingMapper extends BaseMapper<TimeTracking, TimeTrackingDto> {
	TimeTrackingMapper INSTANCE = Mappers.getMapper(TimeTrackingMapper.class);
}
