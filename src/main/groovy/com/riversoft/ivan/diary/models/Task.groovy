package com.riversoft.ivan.diary.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = 'tasks')
class Task {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    Long id

    String name

    String description

}