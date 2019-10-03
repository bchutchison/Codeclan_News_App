package com.codeclan.newsapp.NewsAppProject.repository.ArticleRepository;

import com.codeclan.newsapp.NewsAppProject.models.Article;
import com.codeclan.newsapp.NewsAppProject.projections.EmbedCategoryForArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection  = EmbedCategoryForArticle.class)

public interface ArticleRepository extends JpaRepository<Article, Long> {
    //List<Articles> findArticlesThatHaveCategoryTitle(String Title);
}
