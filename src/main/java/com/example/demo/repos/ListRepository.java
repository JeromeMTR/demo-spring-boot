package com.example.demo.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.List;

public interface ListRepository extends CrudRepository<List, Long> {
  Optional<List> findByNameIgnoreCase(String name);
}
