package com.web.info.service;

import com.web.info.model.entity.TransfferedPoint;
import com.web.info.repository.TransfferedPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferedPointsService extends BaseService<TransfferedPoint, Integer, TransfferedPointRepository>{

    @Autowired
    public TransferedPointsService(TransfferedPointRepository transfferedPointRepository) {
        super(transfferedPointRepository);
    }

}
