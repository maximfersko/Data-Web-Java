package com.web.info.mapper;

import com.web.info.model.dto.TransfferedPointDto;
import com.web.info.model.entity.TransfferedPoint;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransfferedPointMapper extends BaseMapper<TransfferedPoint, TransfferedPointDto> {
	TransfferedPointMapper INSTANCE = Mappers.getMapper(TransfferedPointMapper.class);
}
