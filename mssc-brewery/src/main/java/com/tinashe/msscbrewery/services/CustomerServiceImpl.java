package com.tinashe.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.tinashe.msscbrewery.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public CustomerDto getCustomerById(UUID id) {
		return CustomerDto.builder().Id(UUID.randomUUID())
				.CustomerName("Tinashe Zulu")
				.build();
	}

}
