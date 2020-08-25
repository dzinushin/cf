package com.example.demo3.repository;

import com.example.demo3.domain.Tester;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TestRepo {
    private final MongoTemplate mongoTemplate;

    public void put() {
        Tester t = Tester.builder().data("HOI!").build();
        mongoTemplate.save(t);
    }
}
