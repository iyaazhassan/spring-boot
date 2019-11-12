package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Offers;

@FeignClient("offers-service")
public interface OffersServiceClient {
	
	@RequestMapping(value="/getCurrentOffers", method = RequestMethod.GET)
	public List<Offers> getCurrentOffers();
}
