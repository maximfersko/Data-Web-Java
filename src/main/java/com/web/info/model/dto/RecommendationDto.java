package com.web.info.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class RecommendationDto extends BaseDto<Long> {
	private Long id;
	private PeerDto peer;
	private PeerDto recommendationPeer;
}
