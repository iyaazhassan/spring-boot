package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Recommendation;

@Repository
public interface RecommendationRepository extends MongoRepository<Recommendation, Integer> {

}
