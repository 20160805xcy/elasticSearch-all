package com.xcy.elasticsearchrepository.repository;

import com.xcy.elasticsearchrepository.entity.GoodsInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;


@Component
public interface GoodsRepository extends ElasticsearchRepository<GoodsInfo,Long> {
}