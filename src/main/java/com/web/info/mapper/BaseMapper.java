package com.web.info.mapper;

import com.web.info.model.dto.BaseDto;
import com.web.info.model.entity.BaseEntity;

import java.util.List;


public interface BaseMapper<E extends BaseEntity<?>, D extends BaseDto<?>> {
	D toDto(E entity);

	E fromDto(D dto);

	List<D> toDto(List<E> entity);

	List<E> fromDto(List<D> dto);
}
