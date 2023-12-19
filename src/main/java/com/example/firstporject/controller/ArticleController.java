package com.example.firstporject.controller;

import com.example.firstporject.dto.ArticleForm;
import com.example.firstporject.entity.Article;
import com.example.firstporject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Slf4j
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
        //System.out.println(articleForm);
        log.info(articleForm.toString());

        Article article = articleForm.toEntity();
        //System.out.println(article.toString());

        Article saved = articleRepository.save(article);
        //System.out.println(saved.toString());

        return "";
    }

    @GetMapping("/articles/{id}")
    String getArticle(@PathVariable("id") Long id, Model model){

        Article article = articleRepository.findById(id).orElse(null);

        model.addAttribute("article", article);
        return "articles/show";
    }

}
