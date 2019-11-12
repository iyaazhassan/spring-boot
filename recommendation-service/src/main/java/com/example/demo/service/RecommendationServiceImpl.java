package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.RecommendationRepository;
import com.example.demo.model.Recommendation;

@Service
public class RecommendationServiceImpl implements RecommendationService {

	private RecommendationRepository recommendationRepositiry;
	
	
	@Autowired
	public RecommendationServiceImpl(RecommendationRepository recommendationRepositiry) {
		super();
		this.recommendationRepositiry = recommendationRepositiry;
	}



	@Override
	public List<Recommendation> getAllRecommendation() {
		// TODO Auto-generated method stub
		return recommendationRepositiry.findAll();
	}



	@Override
	@Transactional
	public Recommendation createRecommendation(Recommendation recommendation) {
		// TODO Auto-generated method stub
		return recommendationRepositiry.save(recommendation);
	}



	

}
