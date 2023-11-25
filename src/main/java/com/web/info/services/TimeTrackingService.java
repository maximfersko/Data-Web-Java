package com.web.info.services;

import com.web.info.model.entity.TimeTracking;
import com.web.info.repositories.TimeTrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TimeTrackingService extends BaseService<TimeTracking, Integer, TimeTrackingRepository>{

    @Autowired
    public TimeTrackingService(TimeTrackingRepository timeTrackingRepository) {
        super(timeTrackingRepository);
    }

}
