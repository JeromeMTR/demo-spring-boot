package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.models.List;
import com.example.demo.models.Todo;
import com.example.demo.repos.ListRepository;
import com.example.demo.repos.TodoRepository;


@Component
public class Populator implements CommandLineRunner{

  @Autowired
  private TodoRepository todoRepo;

  @Autowired
  private ListRepository listRepo;

  @Override
  public void run(String... args) throws Exception {
    // TODO Auto-generated method stub

    List list1 = new List("fruits");
    listRepo.save(list1);

    Todo todo1 = new Todo("eat apple", list1);
    todoRepo.save(todo1);

    Todo todo2 = new Todo("eat orange", list1);
    todoRepo.save(todo2);


  }

}
