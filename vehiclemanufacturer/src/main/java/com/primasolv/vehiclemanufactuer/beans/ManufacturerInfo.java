package com.primasolv.vehiclemanufactuer.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ManufacturerInfo {
	@JsonProperty("Results")
	private List<Manufacturer> results;
	public List<Manufacturer> getResults() {
		return results;
	}
	public void setResults(List<Manufacturer> results) {
		this.results = results;
	}
	
	
}
