package com.web.info.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "xp")
public class Xp extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "related_check", referencedColumnName = "id")
    private Check relatedCheck;

    @Column(name = "xp_amount")
    private Integer xpAmount;

}
