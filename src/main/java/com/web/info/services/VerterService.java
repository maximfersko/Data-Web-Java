package com.web.info.services;

import com.web.info.model.entity.Verter;
import com.web.info.repositories.VerterRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class VerterService extends  BaseService<Verter, Integer, VerterRepository>{

    @Autowired
    public VerterService(VerterRepository verterRepository) {
        super(verterRepository);
    }

}
