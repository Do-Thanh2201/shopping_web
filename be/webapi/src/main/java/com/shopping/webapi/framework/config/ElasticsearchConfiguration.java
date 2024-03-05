package com.shopping.webapi.framework.config;

import com.shopping.webapi.api.search.ElasticSearchRepository;
import com.shopping.webapi.api.search.data.ElasticSearchEntity;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import java.util.Arrays;

/** https://github.com/spring-projects/spring-data-elasticsearch */
@SpringBootApplication
public class ElasticsearchConfiguration {

    private final ElasticsearchOperations operations;
    private final ElasticSearchRepository repository;

    public ElasticsearchConfiguration(ElasticsearchOperations operations, ElasticSearchRepository repository) {
        this.operations = operations;
        this.repository = repository;
    }

    @PreDestroy
    public void deleteIndex() {
        operations.indexOps(ElasticSearchEntity.class).delete();
    }

    @PostConstruct
    public void insertDataSample() {

        operations.indexOps(ElasticSearchEntity.class).refresh();

        // Save data sample

        var documents = Arrays.asList(
//                ElasticSearchEntity.builder().name("Spring eXchange 2014 - London")
//                        .keywords(Arrays.asList("java", "spring")).build(), //
//                ElasticSearchEntity.builder().name("Scala eXchange 2014 - London")
//                        .keywords(Arrays.asList("scala", "play", "java")).build(), //
//                ElasticSearchEntity.builder().name("Elasticsearch 2014 - Berlin")
//                        .keywords(Arrays.asList("java", "elasticsearch", "kibana"))
//                        .build(), //
//                ElasticSearchEntity.builder().name("AWS London 2014").keywords(Arrays.asList("cloud", "aws"))
//                        .build(), //
//                ElasticSearchEntity.builder().name("JDD14 - Cracow").keywords(Arrays.asList("java", "spring"))
//                        .build()
        );

//        repository.saveAll(documents);
    }
}
