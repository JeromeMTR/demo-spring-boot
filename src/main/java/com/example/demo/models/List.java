package com.example.demo.models;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class List {

  @Id
  @GeneratedValue
  private Long id;

  @OneToMany(mappedBy = "list")
  private Collection<Todo> todos;

  private String name;

  public List(String listName) {
    this.name = listName;
    this.todos = new ArrayList<Todo>();
  }

  public List() {

  }

  public Collection<Todo> getTodos() {
    return todos;
  }

  public String getName() {
    return name;
  }


}
