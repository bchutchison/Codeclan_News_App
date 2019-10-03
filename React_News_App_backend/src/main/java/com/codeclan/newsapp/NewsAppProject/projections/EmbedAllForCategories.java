package com.codeclan.newsapp.NewsAppProject.projections;

import com.codeclan.newsapp.NewsAppProject.models.Article;
import com.codeclan.newsapp.NewsAppProject.models.Category;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedAllForCategories", types = Category.class)
public interface EmbedAllForCategories {
    public String getName();
    public List<Article> getArticles();
    public Long getId();
}
