package com.xcy.elasticsearchitjc8.service;

import com.xcy.elasticsearchitjc8.model.Article;

import java.util.List;

public interface ArticleService {

    void insert(Article article);

    List<Article> selectAll();

    List<Article> selectByTitle(String title);
}
