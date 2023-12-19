package com.example.firstporject.controller;

import com.example.firstporject.dto.ArticleForm;
import com.example.firstporject.entity.Article;
import com.example.firstporject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    String newArticleForm(){
        return "articles/new";
    }
    @PostMapping("/articles/create")
    String createArticles(ArticleForm articleForm){
        System.out.println(articleForm);

        Article article = articleForm.toEntity();
        System.out.println(article.toString());

        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());

        return "";
    }

}
