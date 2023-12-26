package com.web.info.service;

import com.web.info.model.entity.Verter;
import com.web.info.repository.VerterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerterService extends  BaseService<Verter, Integer, VerterRepository>{

    @Autowired
    public VerterService(VerterRepository verterRepository) {
        super(verterRepository);
    }

}
