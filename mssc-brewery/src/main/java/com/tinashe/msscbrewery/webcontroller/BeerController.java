package com.tinashe.msscbrewery.webcontroller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tinashe.msscbrewery.webmodel.BeerDto;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
		return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
	}
}
