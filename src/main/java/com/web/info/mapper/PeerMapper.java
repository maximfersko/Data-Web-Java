package com.web.info.mapper;

import com.web.info.model.dto.PeerDto;
import com.web.info.model.entity.Peer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PeerMapper extends BaseMapper<Peer, PeerDto> {
	PeerMapper INSTANCE = Mappers.getMapper(PeerMapper.class);
}
