package com.web.info.repository;

import com.web.info.model.entity.Recommendation;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendationRepository extends BaseRepository<Recommendation, Integer> {
}
