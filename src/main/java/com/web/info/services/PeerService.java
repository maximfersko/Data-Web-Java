package com.web.info.services;

import com.web.info.model.entity.Peer;
import com.web.info.repositories.PeerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PeerService extends BaseService<Peer, String, PeerRepository>{

    @Autowired
    public  PeerService(PeerRepository peerRepository) {
        super(peerRepository);
    }

}
