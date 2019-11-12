package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Recommendation;

public interface RecommendationService {
	
	public List<Recommendation> getAllRecommendation();
	public Recommendation createRecommendation(Recommendation recommendation);

}
