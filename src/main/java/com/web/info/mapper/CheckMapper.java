package com.web.info.mapper;

import com.web.info.model.dto.CheckDto;
import com.web.info.model.entity.Check;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CheckMapper extends BaseMapper<Check, CheckDto> {
	CheckMapper INSTANCE = Mappers.getMapper(CheckMapper.class);
}
