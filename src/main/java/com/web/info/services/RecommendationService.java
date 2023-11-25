package com.web.info.services;

import com.web.info.model.entity.Recommendation;
import com.web.info.repositories.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RecommendationService extends BaseService<Recommendation, Integer, RecommendationRepository> {

    @Autowired
    public RecommendationService(RecommendationRepository  recommendationRepository) {
        super(recommendationRepository);
    }

}
