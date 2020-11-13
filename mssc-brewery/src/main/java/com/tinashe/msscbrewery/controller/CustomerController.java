package com.tinashe.msscbrewery.controller;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/customer")
	public ResponseEntity<CustomerDto> saveCustomer(@RequestBody CustomerDto customerDto){
		CustomerDto savedDto = customerService.saveCustomer(customerDto);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location","/api/v1/customer/"+savedDto.getId().toString());
		return new ResponseEntity<>(headers,
				HttpStatus.CREATED);
	}
	
	@PutMapping("/{customerId}")
	public ResponseEntity<?> updateCustomer(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto) {
		customerService.updateById(customerId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/{customerId}")
	public ResponseEntity<?> deleteCustomer(@PathVariable("customerId") UUID customerId){
		customerService.deleteById(customerId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
