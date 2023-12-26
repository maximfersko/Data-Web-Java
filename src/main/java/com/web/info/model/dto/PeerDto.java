package com.web.info.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public class PeerDto extends BaseDto<String> {
	private String pkNickname;
	private LocalDate birthday;

	public String getId() {
		return pkNickname;
	}
}
