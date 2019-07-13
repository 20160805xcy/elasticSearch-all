package com.xcy.elasticsearchjest;

import com.xcy.elasticsearchjest.bean.Employee;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticsearchJestTests {

    @Autowired
    JestClient jestClient;


    @Test
    public void contextLoads() {
        Employee employee = new Employee(1, "张三", "张三喜欢吃米饭");
        Index index = new Index.Builder(employee).index("people").type("employee").build();
        try {
            jestClient.execute(index);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void search() {
        String json = "{\n" +
                "    \"query\" : {\n" +
                "        \"match\" : {\n" +
                "            \"name\" : \"张三\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
        Search search = new Search.Builder(json).addIndex("people").addType("employee").build();
        try {
            SearchResult searchResult = jestClient.execute(search);
            System.out.println(searchResult.getJsonString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
