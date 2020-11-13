package com.tinashe.msscbrewery.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tinashe.msscbrewery.services.BeerService;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BeerController.class)
class BeerControllerTest {

	@Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    BeerService beerService;
	
	@Test
	void testGetBeer() throws Exception {
		mockMvc.perform(get("/api/v1/beer/"+ UUID.randomUUID()
		.toString()).accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}

	@Test
	void testHandlePost() {
	}

	@Test
	void testHandleUpdate() {
	}

	@Test
	void testDeleteBeer() {
	}

	@Test
	void testBeerController() {
	}

}
