package com.tinashe.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.tinashe.msscbrewery.model.BeerDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService{

	@Override
	public BeerDto getBeerById(UUID beerId) {
		// TODO Auto-generated method stub
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("Black Label")
				.beerStyle("Swrrt")
				.build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		// TODO Auto-generated method stub
		return BeerDto.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {
		
	}

	@Override
	public void deleteById(UUID beerId) {
		// TODO Auto-generated method stub
		log.info("deleting beer...");
	}

}
