package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Offers;

import com.example.demo.service.OfferService;

@RestController
public class OffersServiceRestController {
	
	private OfferService offerService;
	
	@Autowired
	public OffersServiceRestController(OfferService offerService) {
		super();
		this.offerService = offerService;
	}

	@RequestMapping(value="/getCurrentOffers",method = RequestMethod.GET)
	@ResponseBody
	public List<Offers> getCurrentOffers(){
			return offerService.getAllOffers();
	}
	
	@PostMapping("/offers")
	public Offers createOffer(@RequestBody Offers offer) {
		return offerService.createOffer(offer);
	}
	

}
