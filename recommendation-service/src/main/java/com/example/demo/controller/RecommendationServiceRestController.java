package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Recommendation;
import com.example.demo.service.RecommendationService;

@RestController
public class RecommendationServiceRestController {
	
	private RecommendationService recommendationService;
	
	
	@Autowired
	public RecommendationServiceRestController(RecommendationService recommendationService) {
		super();
		this.recommendationService = recommendationService;
	}



	@RequestMapping(value="/recommendations",method=RequestMethod.GET)
	@ResponseBody
	public List<Recommendation> getRecommendations(){
//		List<Recommendation> recommendation = new ArrayList<Recommendation>();
//		recommendation.add(new Recommendation("Reco-1","Description-1","Link-1"));
//		recommendation.add(new Recommendation("Reco-2","Description-2","Link-2"));
//		recommendation.add(new Recommendation("Reco-3","Description-3","Link-3"));
//		return recommendation;
		return recommendationService.getAllRecommendation();
				
				
	}
	
	@PostMapping("/recommendations")
	public Recommendation createRecommendations(@RequestBody Recommendation recommendation) {
		return recommendationService.createRecommendation(recommendation);
	}
	
	
	

}
