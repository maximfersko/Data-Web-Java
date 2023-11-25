package com.web.info.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "time_tracking")
public class TimeTracking extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "peer", referencedColumnName = "pk_nickname")
    private Peer peer;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "time")
    private LocalDate time;

    @Column(name = "state")
    private Integer state;

}
