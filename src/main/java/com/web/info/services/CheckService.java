package com.web.info.services;

import com.web.info.model.entity.Check;
import com.web.info.repositories.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckService extends BaseService<Check, Integer, CheckRepository> {

    @Autowired
    public CheckService(CheckRepository baseRepository) {
        super(baseRepository);
    }
}
