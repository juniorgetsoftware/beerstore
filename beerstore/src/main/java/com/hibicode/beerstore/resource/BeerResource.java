package com.hibicode.beerstore.resource;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beers")
public class BeerResource {

	@GetMapping
	public List<String> all() {
		return Arrays.asList("Heineken", "Colorado Indigo", "Stella Artois");
	}
	
}
