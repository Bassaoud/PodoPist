package com.java.todolist.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class Task {

    private String message;
    private Date addedDate;
    
    public Task(String message, Date addedDate ) {
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


	public static class Builder {
        private String message;
        private Date addedDate;

        public Builder(String message) {
            this.message = message;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setAddedDate(Date date) {
            this.addedDate = date;
            return this;
        }

        public Task build() {
            return new Task(this.message, this.addedDate);
        }
    }
}
