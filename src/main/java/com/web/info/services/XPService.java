package com.web.info.services;

import com.web.info.model.entity.Xp;
import com.web.info.repositories.XpRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class XPService extends BaseService<Xp, Integer, XpRepository> {

    @Autowired
    public XPService(XpRepository baseRepository) {
        super(baseRepository);
    }

}
