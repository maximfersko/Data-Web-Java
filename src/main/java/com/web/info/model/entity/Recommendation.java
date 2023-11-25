package com.web.info.model.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "recommendations")
public class Recommendation extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "peer", referencedColumnName = "pk_nickname")
    private Peer peer;

    @OneToOne
    @JoinColumn(name = "recommended_peer", referencedColumnName = "pk_nickname")
    private Peer recommendedPeer;

}
