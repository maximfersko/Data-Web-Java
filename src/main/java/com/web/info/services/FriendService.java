package com.web.info.services;

import com.web.info.model.entity.Friend;
import com.web.info.repositories.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendService extends BaseService<Friend, Integer, FriendRepository>{

    @Autowired
    public FriendService(FriendRepository friendRepository) {
        super(friendRepository);
    }

}
