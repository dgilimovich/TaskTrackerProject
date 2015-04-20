package com.gilimovich.tasktracker.app.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TASKS")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String shortDescription;
    private String fullDescription;

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

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public List<ProgrammerEntity> getProgrammerList() {
        return programmerList;
    }

    public void setProgrammerList(List<ProgrammerEntity> programmerList) {
        this.programmerList = programmerList;
    }

    public ManagerEntity getAuthor() {
        return author;
    }

    public void setAuthor(ManagerEntity author) {
        this.author = author;
    }

    @Column(name = "PROGRAMMERS")
    private List<ProgrammerEntity> programmerList;
    private ManagerEntity author;
}
