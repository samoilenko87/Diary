package com.riversoft.ivan.diary.repositories

import com.riversoft.ivan.diary.models.Task
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface TasksRepository extends CrudRepository<Task, Long> {}

