package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Recommendation;

@FeignClient("recommendation-service")
public interface RecommendationServiceClient {
	
	@RequestMapping(value="/recommendations", method=RequestMethod.GET)
	public List<Recommendation> getRecommendations();

}
