package com.tinashe.msscbrewery.services;

import java.util.UUID;

import com.tinashe.msscbrewery.model.CustomerDto;

public interface CustomerService {
	CustomerDto getCustomerById(UUID id);

	CustomerDto saveCustomer(CustomerDto customerDto);

	void updateById(UUID customerId);

	void deleteById(UUID customerId);
}
