package com.web.info.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "transferred_points")
public class TransfferedPoint extends BaseEntity {

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
