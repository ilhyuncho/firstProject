package com.example.firstporject.repository;

import com.example.firstporject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {


    @Override
    ArrayList<Article> findAll();
}
