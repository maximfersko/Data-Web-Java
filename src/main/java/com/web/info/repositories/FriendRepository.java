package com.web.info.repositories;

import com.web.info.model.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends BaseRepository<Friend, Integer> {
}
