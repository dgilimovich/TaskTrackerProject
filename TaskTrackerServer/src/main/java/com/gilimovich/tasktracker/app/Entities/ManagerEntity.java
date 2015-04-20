package com.gilimovich.tasktracker.app.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Dmitry on 19.04.15.
 */

@Entity
@Table(name="MANAGERS")
public class ManagerEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "PROGRAMMERS")
    private List<ProgrammerEntity> programmerList;

    public List<ProgrammerEntity> getProgrammerList() {
        return programmerList;
    }

    public void setProgrammerList(List<ProgrammerEntity> programmerList) {
        this.programmerList = programmerList;
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
