package com.xcy.elasticsearchitjc8.controller;

import com.xcy.elasticsearchitjc8.model.Article;
import com.xcy.elasticsearchitjc8.service.ArticleService;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * @author xcy
 * @date 2019/10/16 17:13
 * @description
 * @since V1.0.0
 */
@Controller
@RequestMapping("article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    JestClient jestClient;



    //从数据库查询出所有文章,并加入到ES中.
    @RequestMapping("articleToES")
    public String articleToES() {

        List<Article> articles = articleService.selectAll();
        System.out.println(articles.size());

        for (int i = 0; i < articles.size(); i++) {
            Index index = new Index.Builder(articles.get(i)).index("itjc8").type("article").build();
            try {
                jestClient.execute(index);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "index";
    }


}
