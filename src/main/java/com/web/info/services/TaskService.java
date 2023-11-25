package com.web.info.services;

import com.web.info.model.entity.Task;
import com.web.info.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskService extends BaseService<Task, String, TaskRepository>{

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        super(taskRepository);
    }

}
