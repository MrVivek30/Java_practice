package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.models.Flat;
import com.masai.service.FlatService;

import jakarta.validation.Valid;

@RestController
public class FlatController {
	@Autowired
	private FlatService flatService;

	@PostMapping("/addflat")
	public ResponseEntity<Flat> addFlat(@Valid @RequestBody Flat flat) {
		Flat flat2 = flatService.addFlat(flat);
		return new ResponseEntity<>(flat2, HttpStatus.OK);
	}

	@GetMapping("/flatbyprice/{price}")
	public ResponseEntity<List<Flat>> findByPriceless(@PathVariable Integer price) {
		List<Flat> flats = flatService.findFlatByPriceLessThan(price);
		return new ResponseEntity<List<Flat>>(flats, HttpStatus.OK);

	}

	@GetMapping("/flatsbypricelessequal/{price}")
	public ResponseEntity<List<Flat>> findByPriceequal(@PathVariable Integer price) {
		List<Flat> flats = flatService.findFlatByPriceLessThanEqualTo(price);
		return new ResponseEntity<List<Flat>>(flats, HttpStatus.OK);
	}

	@GetMapping("/flatsgreater/{price}")
	public ResponseEntity<List<Flat>> findPriceGreater(@PathVariable Integer price) {
		List<Flat> flats = flatService.findFlatByPriceGreaterThan(price);
		return new ResponseEntity<List<Flat>>(flats, HttpStatus.OK);
	}

	@GetMapping("/flatspricebetween")
	public ResponseEntity<List<Flat>> findpricebetween(@RequestParam Integer price1, @RequestParam Integer price2) {
		List<Flat> flats = flatService.findFlatByPriceBetween(price1, price2);
		return new ResponseEntity<List<Flat>>(flats, HttpStatus.OK);
	}

}
