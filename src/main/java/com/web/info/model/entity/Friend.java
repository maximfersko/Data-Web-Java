package com.web.info.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "friends")
public class Friend extends BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "peer1", referencedColumnName = "pk_nickname")
    private Peer peer1;

    @OneToOne
    @JoinColumn(name = "peer2", referencedColumnName = "pk_nickname")
    private Peer peer2;

}
