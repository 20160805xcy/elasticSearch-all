package com.xcy.elasticsearchitjc8.mapper;

import com.xcy.elasticsearchitjc8.model.Article;
import com.xcy.elasticsearchitjc8.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper extends MyMapper<Article> {

    /**
     * 根据链接地址查询记录
     * @param title
     */
    List<Article> selectByTitle(@Param("title") String title);
}