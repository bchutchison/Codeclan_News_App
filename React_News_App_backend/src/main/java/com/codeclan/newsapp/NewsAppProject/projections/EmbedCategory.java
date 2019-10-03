package com.codeclan.newsapp.NewsAppProject.projections;

import com.codeclan.newsapp.NewsAppProject.models.Article;
import com.codeclan.newsapp.NewsAppProject.models.Category;
import com.codeclan.newsapp.NewsAppProject.models.Journalist;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedCategory", types = Journalist.class)
public interface EmbedCategory {
    public String getFirstName();
    public String getLastName();
    public List<Article> getArticles();
}
