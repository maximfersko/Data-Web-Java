package com.web.info.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "checks")
public class Check {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "peer", referencedColumnName = "pk_nickname")
    private Peer peer;

    @OneToOne
    @JoinColumn(name = "task", referencedColumnName = "pk_title")
    private  Task task;

    @Column(name = "date")
    private LocalDate date;

}
