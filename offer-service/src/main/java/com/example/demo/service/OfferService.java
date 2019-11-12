package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Offers;

public interface OfferService {
	
	public List<Offers> getAllOffers();
	public Offers createOffer(Offers offer);

}
