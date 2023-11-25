package com.web.info.repositories;

import com.web.info.model.entity.Peer;
import org.springframework.stereotype.Repository;

@Repository
public interface PeerRepository extends BaseRepository<Peer, String> {
}
