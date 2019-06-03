package com.example.demo.mymongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyMongoRepository extends MongoRepository<MyMongoDocument, String> {
}
