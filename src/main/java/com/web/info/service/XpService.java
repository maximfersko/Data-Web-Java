package com.web.info.service;

import com.web.info.model.entity.Xp;
import com.web.info.repository.XpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XpService extends BaseService<Xp, Integer, XpRepository> {

    @Autowired
    public XpService(XpRepository baseRepository) {
        super(baseRepository);
    }

}
