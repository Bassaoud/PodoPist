package com.java.todolist.core;


import java.util.Date;

public class Task {

    private String message;
    private Date addedDate;
    
    public Task() {
    }

    protected Task(String message, Date addedDate) {
        this.message = message;
        this.addedDate = addedDate;
    }
    
    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public static Task create(String message) {
        return new Task(message, new Date());
    }

    public static Task create(String message, Date addedDate) {
        return new Task(message, addedDate);
    }
}