package com.web.info.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "peers")
public class Peer {

    @Id
    @Column(name = "pk_nickname")
    private String nickname;

    @Column(name = "birthday")
    private LocalDate birthday;

}
