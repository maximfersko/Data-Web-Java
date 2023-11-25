package com.web.info.services;

import com.web.info.model.entity.P2P;
import com.web.info.repositories.BaseRepository;
import com.web.info.repositories.P2PRepository;
import org.springframework.stereotype.Service;

@Service
public class P2PService extends BaseService<P2P, Integer, P2PRepository> {
    public P2PService(P2PRepository baseRepository) {
        super(baseRepository);
    }
}