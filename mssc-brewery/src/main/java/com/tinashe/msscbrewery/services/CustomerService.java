package com.tinashe.msscbrewery.services;

import java.util.UUID;

import com.tinashe.msscbrewery.model.CustomerDto;

public interface CustomerService {
	CustomerDto getCustomerById(UUID id);
}
