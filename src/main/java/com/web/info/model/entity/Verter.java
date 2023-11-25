package com.web.info.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "verter")
public class Verter extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "related_check", referencedColumnName = "id")
    private Check relatedCheck;

    @Column(name = "state")
    private String state;

    @Column(name = "time")
    private LocalDate time;

}
