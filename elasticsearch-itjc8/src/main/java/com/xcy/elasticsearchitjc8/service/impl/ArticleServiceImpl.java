package com.xcy.elasticsearchitjc8.service.impl;

import com.xcy.elasticsearchitjc8.mapper.ArticleMapper;
import com.xcy.elasticsearchitjc8.model.Article;
import com.xcy.elasticsearchitjc8.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xcy
 * @date 2019/10/16 17:37
 * @description
 * @since V1.0.0
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void insert(Article article) {
        articleMapper.insert(article);
    }

    @Override
    public List<Article> selectAll() {
        return articleMapper.selectAll();
    }

    @Override
    public List<Article> selectByTitle(String title) {
        return articleMapper.selectByTitle(title);
    }
}

