package com.shopping.webapi.api.search;

import com.shopping.webapi.api.search.data.ElasticSearchEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface ElasticSearchRepository extends ElasticsearchRepository<ElasticSearchEntity, String> {
}
