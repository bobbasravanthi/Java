package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.beans.Country;

import utilities.CountryCodeUtilities;

@RestController
@RequestMapping("/country")
public class CountryCodeController {
	@GetMapping("/{code}")
	public int getCode(@PathVariable final int code) {
		if(CountryCodeUtilities.checkValidCountryCode(code)) {
			return code;
		} else {
			throw new ResponseStatusException(
					  HttpStatus.NOT_FOUND, "country code not found"
					);
		}
	}
	
	@GetMapping("/info/{code}")
	public Country getCountryInfo(@PathVariable int code) {
		Country c = new Country();
		c.setCode(code);
		c.setName("country " + code);
		return c;
	}
	
	@RequestMapping(path="/{code}/list/{count}", produces="application/json", method = RequestMethod.GET)
	public List<Country> getCountryList(@PathVariable int code, @PathVariable int count) {
		List<Country> clist = new ArrayList<Country>();
		Country c;
		for(int i =0; i<count; i++) {
			c = new Country();
			c.setCode(code+i);
			c.setName("country " + (code+i));
			clist.add(c);
		}
		return clist;
	}
	
	@GetMapping("/location/{latitude}/{longitude}")
	public String getLocationBasedOnLatLong(@PathVariable float latitude, @PathVariable float longitude) {
		return "Latitude: " + latitude + ", Longitude: "+ longitude ;
	}
}
