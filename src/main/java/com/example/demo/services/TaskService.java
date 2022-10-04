package com.example.demo.services;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;

import java.time.LocalDate;

public class TaskService {
    Task tarea1;
    Task tarea2;
    TaskList propositos;

    public TaskService(){
        this.tarea1= new Task("Understanding Backend", Boolean.TRUE, LocalDate.of(2022,10,3));
        this.tarea2= new Task("Understanding HTML", Boolean.TRUE, LocalDate.of(2022,10,4));
        this.propositos=new TaskList("This is 2022 Proposes");
        propositos.addTask(tarea1);
        propositos.addTask(tarea2);
    }

    public TaskList getTaskList(){
        return this.propositos;
    }
}
