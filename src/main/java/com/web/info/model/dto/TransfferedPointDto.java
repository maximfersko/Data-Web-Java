package com.web.info.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class TransfferedPointDto extends BaseDto<Long> {
	private Long id;
	private PeerDto checkingPeer;
	private PeerDto checkedPeer;
	private Integer pointsAmount;
}
