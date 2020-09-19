package com.tinashe.msscbrewery.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tinashe.msscbrewery.model.CustomerDto;
import com.tinashe.msscbrewery.services.CustomerService;

import lombok.AllArgsConstructor;

@RequestMapping("/api/v1/customer")
@RestController
@AllArgsConstructor
public class CustomerController {
	private final CustomerService customerService;
	
	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID customerId){
		return new ResponseEntity<>(customerService.getCustomerById(customerId), 
				HttpStatus.OK);
	}
}
