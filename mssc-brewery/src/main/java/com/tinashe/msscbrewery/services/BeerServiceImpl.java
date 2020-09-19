package com.tinashe.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.tinashe.msscbrewery.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService{

	@Override
	public BeerDto getBeerById(UUID beerId) {
		// TODO Auto-generated method stub
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("Black Label")
				.beerStyle("Swrrt")
				.build();
	}

}
