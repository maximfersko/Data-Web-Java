package com.web.info.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class TimeTrackingDto extends BaseDto<Long> {
	private Long id;
	private PeerDto peer;
	private LocalDate date;
	private LocalDate time;
	private Integer state;
}
