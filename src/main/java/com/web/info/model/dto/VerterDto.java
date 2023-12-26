package com.web.info.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class VerterDto extends BaseDto<Long> {
	private Long id;
	private CheckDto relatedCheck;
	private String state;
	private LocalDate time;
}
