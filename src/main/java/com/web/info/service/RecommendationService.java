package com.web.info.service;

import com.web.info.model.entity.Recommendation;
import com.web.info.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecommendationService extends BaseService<Recommendation, Integer, RecommendationRepository> {

    @Autowired
    public RecommendationService(RecommendationRepository  recommendationRepository) {
        super(recommendationRepository);
    }

}
