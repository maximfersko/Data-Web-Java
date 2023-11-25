package com.web.info.repositories;

import com.web.info.model.entity.Xp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XpRepository extends BaseRepository<Xp, Integer> {
}
