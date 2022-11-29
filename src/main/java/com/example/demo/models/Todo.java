package com.example.demo.models;

public class Todo {

  private String task;

  private Boolean completed;

  public Todo(String task) {
    this.task = task;
    completed = false;
  }

  public String getTask() {
    return task;
  }

  public Boolean getCompleted() {
    return completed;
  }

}
