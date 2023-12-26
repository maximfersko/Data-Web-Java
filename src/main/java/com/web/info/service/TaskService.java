package com.web.info.service;

import com.web.info.model.entity.Task;
import com.web.info.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService extends BaseService<Task, String, TaskRepository>{

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        super(taskRepository);
    }

}
