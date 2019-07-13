package com.xcy.elasticsearchjest;

import com.xcy.elasticsearchjest.bean.Book;
import com.xcy.elasticsearchjest.repository.BookRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author xcy
 * @Desc
 * @date 2019/7/13 17:49
 * @Version v1.0
 */
public class ElasticsearchSpringDataTests {
    @Autowired
    BookRepository bookRepository;

    /**
     * SpringData ES索引
     */
    @Test
    public void test1() {
        Book book = new Book(1, "三国演义", "罗贯中");
        bookRepository.index(book);
    }

    /**
     * 根据书名查询
     */
    @Test
    public void test2() {
        List<Book> list = bookRepository.findBookByName("演义");
        for (Book book : list) {
            System.out.println(book);
        }
    }
}
