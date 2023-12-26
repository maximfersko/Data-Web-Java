package com.web.info.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tasks")
public class Task extends BaseEntity<String> {

    @Id
    @Column(name = "pk_title")
    private String title;

    @OneToOne
    @JoinColumn(name = "parent_task", referencedColumnName = "pk_title")
    private Task parentTask;

    @Column(name = "max_xp")
    private Integer maxXP;

	@Override
	public String getId() {
		return title;
	}
}
