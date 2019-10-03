package com.codeclan.newsapp.NewsAppProject.controller;

import com.codeclan.newsapp.NewsAppProject.models.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.codeclan.newsapp.NewsAppProject.models.Journalist;
import com.codeclan.newsapp.NewsAppProject.repository.ArticleRepository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/articles")
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    // Aggregate root

    @GetMapping("/articles")
    List<Article> all() {
        return articleRepository.findAll();
    }

    @PostMapping("/articles")
    Article newArticle(@RequestBody Article newArticle) {
        return articleRepository.save(newArticle);
    }

    //Delete
    @DeleteMapping("/articles/{id}")
    void deleteArticle(@PathVariable Long id) {
        articleRepository.deleteById(id);
    }
}

