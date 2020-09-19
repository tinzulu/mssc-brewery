package com.tinashe.msscbrewery.services;

import java.util.UUID;

import com.tinashe.msscbrewery.model.BeerDto;

public interface BeerService {
	BeerDto getBeerById(UUID beerId);
}
