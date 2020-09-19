package com.tinashe.msscbrewery.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tinashe.msscbrewery.model.BeerDto;
import com.tinashe.msscbrewery.services.BeerService;

import lombok.AllArgsConstructor;

@RequestMapping("/api/v1/beer")
@RestController
@AllArgsConstructor
public class BeerController {
	
	private final BeerService beerService;
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
		return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
	}
}
