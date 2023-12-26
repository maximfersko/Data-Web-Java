package com.web.info.mapper;

import com.web.info.model.dto.P2PDto;
import com.web.info.model.entity.P2P;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface P2PMapper extends BaseMapper<P2P, P2PDto> {
	P2PMapper INSTANCE = Mappers.getMapper(P2PMapper.class);
}
