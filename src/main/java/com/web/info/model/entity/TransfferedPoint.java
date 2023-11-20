package com.web.info.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "transferred_points")
public class TransfferedPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "checking_peer", referencedColumnName = "pk_nickname")
    private Peer checkingPer;

    @OneToOne
    @JoinColumn(name = "checked_peer", referencedColumnName = "pk_nickname")
    private Peer checkedPeer;

    @Column(name = "points_amount")
    private Integer pointsAmount;

}
