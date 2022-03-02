package com.test.elasticsearchdemo.Repository;

import com.test.elasticsearchdemo.Model.Employer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployerRepository extends ElasticsearchRepository<Employer, String> {
    List<Employer> findAll();

    List<Employer> findAllById(String id);
}
