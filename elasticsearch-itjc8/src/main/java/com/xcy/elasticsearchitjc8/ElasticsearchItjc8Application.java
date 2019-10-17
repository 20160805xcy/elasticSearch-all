package com.xcy.elasticsearchitjc8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.xcy.elasticsearchitjc8.mapper"})
public class ElasticsearchItjc8Application {

    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchItjc8Application.class, args);
    }

}
