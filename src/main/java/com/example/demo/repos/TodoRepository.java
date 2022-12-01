package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
