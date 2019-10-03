package com.codeclan.newsapp.NewsAppProject.repository.CategoryRepository;

import com.codeclan.newsapp.NewsAppProject.models.Category;
import com.codeclan.newsapp.NewsAppProject.projections.EmbedArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(excerptProjection = EmbedArticle.class)

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
