package com.web.info.mapper;

import com.web.info.model.dto.FriendDto;
import com.web.info.model.entity.Friend;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FriendsMapper extends BaseMapper<Friend, FriendDto> {
	FriendsMapper INSTANCE = Mappers.getMapper(FriendsMapper.class);
}
