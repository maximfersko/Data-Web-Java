package com.web.info.service;

import com.web.info.model.entity.TimeTracking;
import com.web.info.repository.TimeTrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeTrackingService extends BaseService<TimeTracking, Integer, TimeTrackingRepository>{

    @Autowired
    public TimeTrackingService(TimeTrackingRepository timeTrackingRepository) {
        super(timeTrackingRepository);
    }

}
