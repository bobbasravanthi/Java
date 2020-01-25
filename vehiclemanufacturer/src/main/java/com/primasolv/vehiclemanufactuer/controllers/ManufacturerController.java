package com.primasolv.vehiclemanufactuer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.primasolv.vehiclemanufactuer.beans.ManufacturerInfo;
import com.primasolv.vehiclemanufactuer.utilities.Utility;



@RestController
@RequestMapping("/vehicle")
public class ManufacturerController {
	@Autowired
	   private RestTemplateBuilder restTemplate;
	@RequestMapping(path="/mfrDetails/{mfr}", produces="application/json", method = RequestMethod.GET)
	public ResponseEntity<ManufacturerInfo> getManufacturerInfo(@PathVariable String mfr) {
		 if(!Utility.isValidManufacturer(mfr)) {
			 throw new ResponseStatusException(
					  HttpStatus.BAD_REQUEST, "Invalid Manufacturer"
					);
		 } else {
			 ManufacturerInfo mfrInfo = restTemplate.build().getForObject("https://vpic.nhtsa.dot.gov/api/vehicles/GetManufacturerDetails/{mfr}?format=json", ManufacturerInfo.class, mfr);
			 return ResponseEntity.status(HttpStatus.OK).body(mfrInfo);
		 }
		
	}
	
	
}
