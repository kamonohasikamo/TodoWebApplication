package com.example.DemoApplication;

import java.io.Serializable;

public class Message implements Serializable {

    private String todoName;
    private String todoTime;

    public String getName() {
        return todoName;
    }

    public String todoTime() {
        return todoTime;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public void setTodoTime(String todoTime) {
        this.todoTime = todoTime;
    }

}
