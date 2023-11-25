package com.web.info.repositories;

import com.web.info.model.entity.Check;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckRepository extends BaseRepository<Check, Integer> {
}
