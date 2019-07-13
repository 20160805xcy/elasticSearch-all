package com.xcy.elasticsearchjest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * SpringBoot默认支持两种技术和ES交互
 * 1、Jest（默认不生效）
 *
 *
 * 2、SpringData ElasticSearch
 */
@SpringBootApplication
public class ElasticsearchJestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchJestApplication.class, args);
    }

}
