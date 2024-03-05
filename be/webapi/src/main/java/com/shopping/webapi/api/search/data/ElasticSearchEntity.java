package com.shopping.webapi.api.search.data;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;


@Data
@Builder
@Document(indexName = "elasticsearchentity-index")
public class ElasticSearchEntity {
    private @Id String id;
    private String name;
    private List<String> keywords;
}

