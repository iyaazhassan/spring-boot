package com.example.demo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IntegrationClient;
import com.google.common.net.MediaType;

@RestController
public class MainController {
	
	@Autowired
	private IntegrationClient integrationClient;
	
	@GetMapping("/offersAndRecommendation")
	public Map<String, Collection> offersAndRecommendation(){
		Map<String, Collection> result = new HashMap<String, Collection>();
		result.put("offers", integrationClient.getOffers());
		result.put("recommendations", integrationClient.getRecommendations());
		return result;
	}

}
