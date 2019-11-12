package com.example.demo.service;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Offers;
import com.example.demo.model.Recommendation;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class IntegrationClient {
	
	@Autowired
	private OffersServiceClient offersClient;
	
	@Autowired
	private RecommendationServiceClient recommendationClient;
	
	
	public Collection<Recommendation> getRecommendationFallback(){
		
		System.out.println("========getRecommendationFallback=========");
		return Arrays.asList();
	}
	
	@HystrixCommand(fallbackMethod = "getRecommendationFallback")
	public Collection<Recommendation> getRecommendations() {
		return this.recommendationClient.getRecommendations();
	}

	
	
	
	public Collection<Offers> getOffersFallback(){
		
		System.out.println("========getRecommendationFallback=========");
		return Arrays.asList();
	}
	
	
	@HystrixCommand(fallbackMethod = "getOffersFallback")
	public Collection<Offers> getOffers() {
		return this.offersClient.getCurrentOffers();
	}

	

}
