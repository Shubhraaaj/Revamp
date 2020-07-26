package com.accomnow.boosted.models;

import java.io.Serializable;

public class Activity implements Serializable {
    private String task_name, task_time;
    private boolean task_status;
    private int tasktype;

    public Activity(){}

    public Activity(String task_name, String task_time, boolean task_status, int tasktype) {
        this.task_name = task_name;
        this.task_time = task_time;
        this.task_status = task_status;
        this.tasktype = tasktype;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_time() {
        return task_time;
    }

    public void setTask_time(String task_time) {
        this.task_time = task_time;
    }

    public boolean isTask_status() {
        return task_status;
    }

    public void setTask_status(boolean task_status) {
        this.task_status = task_status;
    }

    public int getTasktype() {
        return tasktype;
    }

    public void setTasktype(int tasktype) {
        this.tasktype = tasktype;
    }
}
