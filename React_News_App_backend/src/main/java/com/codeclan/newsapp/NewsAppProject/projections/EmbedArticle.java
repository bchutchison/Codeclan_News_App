package com.codeclan.newsapp.NewsAppProject.projections;

import com.codeclan.newsapp.NewsAppProject.models.Article;
import com.codeclan.newsapp.NewsAppProject.models.Category;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedArticle", types = Category.class)
public interface EmbedArticle {
    public String getName();
    public List<Article> getArticles();
}
