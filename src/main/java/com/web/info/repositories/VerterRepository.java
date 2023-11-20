package com.web.info.repositories;

import com.web.info.model.entity.Verter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerterRepository extends JpaRepository<Verter, Integer> {
}
