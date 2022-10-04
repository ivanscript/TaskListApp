package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private String name;
    private List<Task>taskLists;

    public TaskList(String name) {
        this.setName(name);
        this.taskLists=new ArrayList<Task>();
    }

    public void addTask(Task task){
        this.taskLists.add(task);
    }

    public List<Task> getTaskLists() {
        return taskLists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
