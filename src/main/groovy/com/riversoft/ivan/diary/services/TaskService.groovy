package com.riversoft.ivan.diary.services

import com.riversoft.ivan.diary.repositories.TasksRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TaskService {
    @Autowired
    TasksRepository tasksRepository

    List findAll(){
        tasksRepository.findAll().asList()
    }

    def getTaskById(Long id) {
        tasksRepository.findById(id) ?: "No task with ID ${id}"
    }

}
