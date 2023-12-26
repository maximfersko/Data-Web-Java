package com.web.info.service;

import com.web.info.model.entity.P2P;
import com.web.info.repository.P2PRepository;
import org.springframework.stereotype.Service;

@Service
public class P2PService extends BaseService<P2P, Integer, P2PRepository> {
    public P2PService(P2PRepository baseRepository) {
        super(baseRepository);
    }
}
