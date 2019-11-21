package com.riversoft.ivan.diary.controllers

import com.riversoft.ivan.diary.models.Task
import com.riversoft.ivan.diary.services.TaskService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController



@Slf4j
@RestController
@RequestMapping('tasks')
class TasksController {
    @Autowired
    TaskService taskService

    @GetMapping('')
    List findAll() {
        taskService.findAll()
    }
    @GetMapping('{id}')
    def findTask(@PathVariable long id) {
        taskService.getTaskById(id)
    }
}
