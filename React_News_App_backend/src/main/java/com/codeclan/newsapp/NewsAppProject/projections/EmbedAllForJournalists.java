package com.codeclan.newsapp.NewsAppProject.projections;

import com.codeclan.newsapp.NewsAppProject.models.Article;
import com.codeclan.newsapp.NewsAppProject.models.Journalist;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedAllForJournalists", types = Journalist.class)
public interface EmbedAllForJournalists {
    public String getFirstName();
    public String getLastName();
    public List<Article> getArticles();
}
