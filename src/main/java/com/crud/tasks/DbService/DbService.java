package com.crud.tasks.DbService;

import com.crud.tasks.domain.Task;
import com.crud.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Component
public class DbService {
    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(final Long id) {
        Optional<Task> task = repository.findAll().stream().filter(i -> i.getId().equals(id)).findFirst();
        if (task.isPresent()) {
            return task.get();
        } return null;
    }

    public Task saveTask(final Task task) {
        return repository.save(task);
    }
}
