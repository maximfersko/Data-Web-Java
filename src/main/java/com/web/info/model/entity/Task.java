package com.web.info.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "tasks")
public class Task extends BaseEntity {

    @Id
    @Column(name = "pk_title")
    private String title;

    @OneToOne
    @JoinColumn(name = "parent_task", referencedColumnName = "pk_title")
    private Task parentTask;

    @Column(name = "max_xp")
    private Integer maxXP;

}
