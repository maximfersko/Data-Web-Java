package com.web.info.service;

import com.web.info.model.entity.Check;
import com.web.info.repository.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckService extends BaseService<Check, Integer, CheckRepository> {

    @Autowired
    public CheckService(CheckRepository baseRepository) {
        super(baseRepository);
    }
}
