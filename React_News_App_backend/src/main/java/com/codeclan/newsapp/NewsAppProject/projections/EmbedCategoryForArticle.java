package com.codeclan.newsapp.NewsAppProject.projections;

import com.codeclan.newsapp.NewsAppProject.models.Article;
import com.codeclan.newsapp.NewsAppProject.models.Category;
import com.codeclan.newsapp.NewsAppProject.models.Journalist;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name ="embedAllForCategories", types = Article.class)
public interface EmbedCategoryForArticle {
    public String getTitle();
    public int getRating();
    public String getSummary();
    public String getContent();
    public List<Category> getCategories();
    public Journalist getJournalist();
    public String getPicUrl();
    public Long getId();

}

