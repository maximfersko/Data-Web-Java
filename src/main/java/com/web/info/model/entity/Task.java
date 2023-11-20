package com.web.info.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tasks")
public class Task {

    @Id
    @Column(name = "pk_title")
    private String title;

    @OneToOne
    @JoinColumn(name = "parent_task", referencedColumnName = "pk_title")
    private Task parentTask;

    @Column(name = "max_xp")
    private Integer maxXP;

}
