package com.web.info.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "peers")
public class Peer extends BaseEntity<String> {

    @Id
    @Column(name = "pk_nickname")
    private String nickname;

    @Column(name = "birthday")
    private LocalDate birthday;

	@Override
	public String getId() {
		return nickname;
	}
}
