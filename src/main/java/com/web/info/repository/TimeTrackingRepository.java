package com.web.info.repository;

import com.web.info.model.entity.TimeTracking;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTrackingRepository extends BaseRepository<TimeTracking, Integer> {
}
