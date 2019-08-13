package com.example.DemoApplication;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "todolist")
public class Message {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "todoName", nullable = false)
    private String todoName;

    @Column(name = "todoTime", nullable = false)
    private String todoTime;

    public Integer getId() {
        return id;
    }

    public String getTodoName() {
        return todoName;
    }

    public String getTodoTime() {
        return todoTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public void setTodoTime(String todoTime) {
        this.todoTime = todoTime;
    }

}
