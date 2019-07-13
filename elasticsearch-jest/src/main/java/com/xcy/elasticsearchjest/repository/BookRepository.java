package com.xcy.elasticsearchjest.repository;

import com.xcy.elasticsearchjest.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookRepository extends ElasticsearchRepository<Book, Integer> {

    List<Book> findBookByName(String name);
}
