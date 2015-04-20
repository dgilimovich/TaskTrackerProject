package com.gilimovich.tasktracker.app.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Dmitry on 19.04.15.
 */

@Entity
@Table(name="PROGRAMMERS")
public class ProgrammerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "TASKS")
    private List<TaskEntity> taskList;
    private ManagerEntity boss;

    public ManagerEntity getBoss() {
        return boss;
    }

    public void setBoss(ManagerEntity boss) {
        this.boss = boss;
    }

    public List<TaskEntity> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<TaskEntity> taskList) {
        this.taskList = taskList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

