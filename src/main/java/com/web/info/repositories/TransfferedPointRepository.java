package com.web.info.repositories;

import com.web.info.model.entity.TransfferedPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransfferedPointRepository extends JpaRepository<TransfferedPoint, Integer> {
}
