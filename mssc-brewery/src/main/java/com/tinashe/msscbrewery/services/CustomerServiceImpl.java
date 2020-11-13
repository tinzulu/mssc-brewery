package com.tinashe.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.tinashe.msscbrewery.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public CustomerDto getCustomerById(UUID id) {
		return CustomerDto.builder().id(UUID.randomUUID())
				.customerName("Tinashe Zulu")
				.build();
	}

	@Override
	public CustomerDto saveCustomer(CustomerDto customerDto) {
		return CustomerDto.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateById(UUID customerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(UUID customerId) {
		// TODO Auto-generated method stub
		
	}

}
