package com.hibicode.beerstore.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hibicode.beerstore.model.Beer;
import com.hibicode.beerstore.repository.Beers;

@RestController
@RequestMapping("/beers")
public class BeerResource {

	@Autowired
	private Beers beers;
	
	@GetMapping
	public List<Beer> all() {
		return beers.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Beer create(@RequestBody Beer beer) {
		return beers.save(beer);
	}
}
