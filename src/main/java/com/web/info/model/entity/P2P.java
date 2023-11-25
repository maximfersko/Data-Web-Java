package com.web.info.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "p2p")
public class P2P extends BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "related_check", referencedColumnName = "id")
    private Check related_check;

    @OneToOne
    @JoinColumn(name = "checking_peer", referencedColumnName = "pk_nickname")
    private Peer checking_peer;

    @Column(name = "time")
    private LocalDate time;

}
