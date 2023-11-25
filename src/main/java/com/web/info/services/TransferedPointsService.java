package com.web.info.services;

import com.web.info.model.entity.TransfferedPoint;
import com.web.info.repositories.TransfferedPointRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TransferedPointsService extends BaseService<TransfferedPoint, Integer, TransfferedPointRepository>{

    @Autowired
    public TransferedPointsService(TransfferedPointRepository transfferedPointRepository) {
        super(transfferedPointRepository);
    }

}
