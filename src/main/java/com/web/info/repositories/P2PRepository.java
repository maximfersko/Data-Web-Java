package com.web.info.repositories;

import com.web.info.model.entity.P2P;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface P2PRepository extends JpaRepository<P2P, Integer> {
}
