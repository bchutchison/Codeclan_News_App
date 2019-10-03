package com.codeclan.newsapp.NewsAppProject.repository.JournalistRepository;

import com.codeclan.newsapp.NewsAppProject.models.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface JournalistRepository extends JpaRepository<Journalist, Long> {
}
