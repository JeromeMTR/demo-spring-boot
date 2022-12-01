package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Todo {

  @Id
  @GeneratedValue
  private Long id;

  private String task;

  private Boolean completed;

  @ManyToOne
  private List list;

  public Todo(String task, List list) {
    this.task = task;
    this.list = list;
    completed = false;
  }

  public Todo() {

  }

  public String getTask() {
    return task;
  }

  public Boolean getCompleted() {
    return completed;
  }

}
