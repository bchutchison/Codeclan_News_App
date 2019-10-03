package com.codeclan.newsapp.NewsAppProject.controller;

import com.codeclan.newsapp.NewsAppProject.models.Journalist;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.codeclan.newsapp.NewsAppProject.repository.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/journalists")
public class JournalistController {
    @Autowired
    JournalistRepository journalistRepository;

    // Aggregate root

    @GetMapping("/journalists")
    List<Journalist> all() {
        return journalistRepository.findAll();
    }

    @PostMapping("/journalists")
    Journalist newJournalist(@RequestBody Journalist newJournalist) {
        return journalistRepository.save(newJournalist);
    }

    //Delete
    @DeleteMapping("/journalists/{id}")
    void deleteJournalist(@PathVariable Long id) {
        journalistRepository.deleteById(id);
    }
}

