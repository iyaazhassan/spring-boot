package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.OfferRepository;
import com.example.demo.model.Offers;

@Service
public class OfferServiceImpl implements OfferService {

	
	private OfferRepository offerRepository;
	
	@Autowired
	public OfferServiceImpl(OfferRepository offerRepository) {
		super();
		this.offerRepository = offerRepository;
	}

	@Override
	@Transactional
	public List<Offers> getAllOffers() {
		// TODO Auto-generated method stub
		return offerRepository.findAll();
	}

	@Override
	@Transactional
	public Offers createOffer(Offers offer) {
		// TODO Auto-generated method stub
		return offerRepository.save(offer);
	}

}
