package com.web.info.repositories;

import com.web.info.model.entity.Recommentation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommentation, Integer> {
}
