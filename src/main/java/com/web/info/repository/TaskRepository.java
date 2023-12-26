package com.web.info.repository;

import com.web.info.model.entity.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends BaseRepository<Task, String> {
}
