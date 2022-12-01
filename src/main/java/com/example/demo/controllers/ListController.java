package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.List;
import com.example.demo.repos.ListRepository;

@Controller
public class ListController {

  private ListRepository listRepo;

  public ListController(ListRepository listRepo) {
    this.listRepo = listRepo;
  }

  @GetMapping("/list/{name}")
  public String getList(@PathVariable String name, Model model) {

    model.addAttribute("list", listRepo.findByNameIgnoreCase(name).get());

    return "list";
  }

}
