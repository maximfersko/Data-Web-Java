package com.web.info.service;

import com.web.info.model.entity.Peer;
import com.web.info.repository.PeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeerService extends BaseService<Peer, String, PeerRepository>{

    @Autowired
    public  PeerService(PeerRepository peerRepository) {
        super(peerRepository);
    }

}
