package com.example.firstporject.controller;

import com.example.firstporject.dto.ArticleForm;
import com.example.firstporject.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @GetMapping("/articles/new")
    String newArticleForm(){
        return "articles/new";
    }
    @PostMapping("/articles/create")
    String createArticles(ArticleForm articleForm){
        System.out.println(articleForm);

        return "";
    }

}
