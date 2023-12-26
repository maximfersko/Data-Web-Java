package com.web.info.mapper;

import com.web.info.model.dto.XpDto;
import com.web.info.model.entity.Xp;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface XpMapper extends BaseMapper<Xp, XpDto> {
	XpMapper INSTANCE = Mappers.getMapper(XpMapper.class);
}
